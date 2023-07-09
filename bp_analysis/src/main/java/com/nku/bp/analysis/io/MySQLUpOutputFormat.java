package com.nku.bp.analysis.io;

import com.nku.bp.common.util.JdbcUtil;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.PathOutputCommitter;
import org.apache.hadoop.mapreduce.lib.output.PathOutputCommitterFactory;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class MySQLUpOutputFormat extends OutputFormat<Text,Text> {
    protected static class MySQLRecordWriter extends RecordWriter<Text,Text> {

        private Connection connection = null;


        public MySQLRecordWriter(){
            //获取资源
            connection= JdbcUtil.getConnection();
        }


        /**
         * 输出数据
         * @param key
         * @param value
         * @throws IOException
         * @throws InterruptedException
         */
        @Override
        public void write(Text key, Text value) throws IOException, InterruptedException {
            // 获得reducer处理后的数据
            // 将分析完的数据存入mysql中
            System.out.println(value.toString());
            String[] values=value.toString().split("_");
            // 获取数据,此时单位为千，弹幕单位为1
            Float sumView = Float.parseFloat(values[0]);
            Float sumdan = Float.parseFloat(values[1]);
            Float sumLike = Float.parseFloat(values[2]);
            Float sumCoin = Float.parseFloat(values[3]);
            Float sumCollect = Float.parseFloat(values[4]);
            Float sumShare = Float.parseFloat(values[5]);

            PreparedStatement ps=null;
            try {
                String insertSQL="insert into tb_up(up,upView,updanmaku,upLike,upCoin,upCollect,upShare,danLike,coinLike,collectLike,shareLike) values(?,?,?,?,?,?,?,?,?,?,?)";
                ps = connection.prepareStatement(insertSQL);

                ps.setString(1,key.toString());
                ps.setDouble(2,sumView);
                ps.setDouble(3,sumdan);
                ps.setDouble(4,sumLike);
                ps.setDouble(5,sumCoin);
                ps.setDouble(6,sumCollect);
                ps.setDouble(7,sumShare);
                ps.setDouble(8,sumdan/sumLike);
                ps.setDouble(9,sumCoin/sumLike);
                ps.setDouble(10,sumCollect/sumLike);
                ps.setDouble(11,sumShare/sumLike);
                ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if(ps!=null){
                    try {
                        ps.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /**
         * 释放资源
         * @param context
         * @throws IOException
         * @throws InterruptedException
         */
        @Override
        public void close(TaskAttemptContext context) throws IOException, InterruptedException {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public RecordWriter<Text, Text> getRecordWriter(TaskAttemptContext context) throws IOException, InterruptedException {
        return new MySQLUpOutputFormat.MySQLRecordWriter();
    }

    @Override
    public void checkOutputSpecs(JobContext context) throws IOException, InterruptedException {

    }
    private PathOutputCommitter committer = null;
    public static Path getOutputPath(JobContext job) {
        String name = job.getConfiguration().get(FileOutputFormat.OUTDIR);
        return name == null ? null: new Path(name);
    }
    //提交mapreduce给hadoop
    @Override
    public OutputCommitter getOutputCommitter(TaskAttemptContext context) throws IOException, InterruptedException {
        if (committer == null) {
            Path output = getOutputPath(context);
            committer = PathOutputCommitterFactory.getCommitterFactory(
                    output,
                    context.getConfiguration()).createOutputCommitter(output, context);
        }
        return committer;
    }
}
