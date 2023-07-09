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

public class MySQLVideoOutputFormat extends OutputFormat<Text,Text> {

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
            String[] values=value.toString().split("_break_");
            // 获取数据
            String cate = values[0];
            String name = values[1];
            String up = values[2];
            String bv = values[3];
            float view = Float.parseFloat(values[4]);
            float like = Float.parseFloat(values[5]);
            float coin = Float.parseFloat(values[6]);
            float collect = Float.parseFloat(values[7]);
            float share = Float.parseFloat(values[8]);

            PreparedStatement ps=null;
            try {
                String insertSQL="insert into tb_video(cate,videoName,up,bv,videoView,videoLike,videoCoin,videoCollect,videoShare) values(?,?,?,?,?,?,?,?,?)";
                ps = connection.prepareStatement(insertSQL);

                ps.setString(1,cate);
                ps.setString(2,name);
                ps.setString(3,up);
                ps.setString(4,bv);
                ps.setDouble(5,view);
                ps.setDouble(6,like);
                ps.setDouble(7,coin);
                ps.setDouble(8,collect);
                ps.setDouble(9,share);

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
        return new MySQLVideoOutputFormat.MySQLRecordWriter();
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
