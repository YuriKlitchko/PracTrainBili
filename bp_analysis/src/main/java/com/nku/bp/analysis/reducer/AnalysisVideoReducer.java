package com.nku.bp.analysis.reducer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class AnalysisVideoReducer extends Reducer<Text, Text,Text,Text> {


    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        // 此时的key相同且唯一

        // 写一个优先队列，作为排行榜
        Queue<String> rank = new PriorityQueue<>(7,videoComparator); // 自定义比较
        for (Text value : values) {
            String data = value.toString();
            rank.add(data);
            while(rank.size()>100){
                rank.poll();
            }
        }


        while (!rank.isEmpty()){
            context.write(key,new Text(rank.poll()));
        }
    }

    //匿名Comparator实现
    public static Comparator<String> videoComparator= new Comparator<String>(){

        @Override
        public int compare(String video1, String video2) {
            String datas1[] = video1.split("_break_");
            String datas2[] = video2.split("_break_");
            Float coinLike1 = Float.parseFloat(datas1[datas1.length-3]);
            Float coinLike2 = Float.parseFloat(datas2[datas2.length-3]);
            return (int)(coinLike1-coinLike2);
        }
    };

}
