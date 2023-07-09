package com.nku.bp.analysis.reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;


public class AnalysisUpReducer extends Reducer<Text, Text,Text,Text> {
    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        // 此时的key相同且唯一
        // 在此案例中意味着视频数据均属于同一个分区


        // 各数据的总和（均以千为单位）
        float sumView=0;
        float sumdanmaku=0;
        float sumLike=0;
        float sumCoin=0;
        float sumCollect=0;
        float sumShare=0;
        // 加和统计
        for (Text value : values) {
            String datas[] = value.toString().split("_");
            sumView += Float.parseFloat(datas[0]);
            sumdanmaku += Float.parseFloat(datas[1]);
            sumLike += Float.parseFloat(datas[2]);
            sumCoin += Float.parseFloat(datas[3]);
            sumCollect += Float.parseFloat(datas[4]);
            sumShare += Float.parseFloat(datas[5]);
        }
        String data = sumView+"_"+sumdanmaku+"_"+sumLike+"_"+sumCoin+"_"+sumCollect+"_"+sumShare;
        System.out.println(data);
        // 写给OutputFormat
        context.write(key,new Text(data));
    }
}
