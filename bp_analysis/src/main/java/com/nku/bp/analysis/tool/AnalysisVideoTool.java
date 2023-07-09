package com.nku.bp.analysis.tool;


import com.nku.bp.analysis.io.MySQLVideoOutputFormat;
import com.nku.bp.analysis.mapper.AnalysisVideoMapper;
import com.nku.bp.analysis.reducer.AnalysisVideoReducer;
import com.nku.bp.common.constant.Names;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.JobStatus;
import org.apache.hadoop.util.Tool;

public class AnalysisVideoTool implements Tool {
    @Override
    public int run(String[] args) throws Exception {
        // 获取job
        Job job= Job.getInstance();
        // 设置jar位置
        job.setJarByClass(AnalysisVideoTool.class);
        // 扫描主叫列族
        Scan scan=new Scan();

        // 设置mapper
        // hbase.mapreduce.TableMapReduceUtil
        // 使用的为hbase的mapreduce
        // 因此在参数中传递hbase的表名即可定位数据
        TableMapReduceUtil.initTableMapperJob(
                Names.TABLE.getValue(),     // 定位表
                scan,       // Scan用于将数据传给mapper
                AnalysisVideoMapper.class,
                Text.class,
                Text.class,
                job
        );

        // 设置reducer
        job.setReducerClass(AnalysisVideoReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(Text.class);
        // 设置输出
        // 类中的write函数将数据写入mysql中
        job.setOutputFormatClass(MySQLVideoOutputFormat.class);
        // 提交
        boolean flag = job.waitForCompletion(true);
        if(flag){
            return JobStatus.State.SUCCEEDED.getValue();
        }else{
            return JobStatus.State.FAILED.getValue();
        }
    }

    @Override
    public void setConf(Configuration conf) {

    }

    @Override
    public Configuration getConf() {
        return null;
    }

}