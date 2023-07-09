package com.nku.bp.analysis.mapper;

import com.nku.bp.common.constant.Names;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.util.Map;

public class AnalysisVideoMapper extends TableMapper<Text,Text> {

    // b站视频通常以万为单位
    public String getW(String num){
        float numk = Float.parseFloat(num);
        numk = numk/10000;
        String numkStr = Float.toString(numk);
        return numkStr;
    }

    @Override
    protected void map(ImmutableBytesWritable key, Result value, Context context)
            throws IOException, InterruptedException {
        // key: rowkey
        // value: rowkey对应的数据
        // 使用getFamilyMap获得列名与数据的键值对
        Map<byte[], byte[]> kvPair = value.getFamilyMap(Bytes.toBytes(Names.INFO.getValue()));
        String cate = new String(kvPair.get(Bytes.toBytes("cate")),"utf-8");    // utf-8必须，否则会乱码
        String name = new String(kvPair.get(Bytes.toBytes("name")),"utf-8");
        String up = new String(kvPair.get(Bytes.toBytes("up")),"utf-8");
        String view = new String(kvPair.get(Bytes.toBytes("view")));
        String like = new String(kvPair.get(Bytes.toBytes("like")));
        String coin = new String(kvPair.get(Bytes.toBytes("coin")));
        String bv = new String(kvPair.get(Bytes.toBytes("bv")));
        String collect = new String(kvPair.get(Bytes.toBytes("collect")));
        String share = new String(kvPair.get(Bytes.toBytes("share")));

        // 将数据拼接，传给reducer
        // 分割符设置的复杂一些，防止视频名或up名中含有分隔符
        String data = cate+"_break_"+name+"_break_"+up+"_break_"+bv+"_break_"+getW(view)+"_break_"+getW(like)+
                "_break_"+getW(coin)+"_break_"+getW(collect)+"_break_"+getW(share);


        context.write(new Text("video"),new Text(data));
        // key: video       这里key选用同一个值，在reduce中做串行处理
        // value: data
    }
}