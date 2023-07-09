package com.nku.bp.analysis.mapper;

import com.nku.bp.common.constant.Names;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.TableMapper;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.io.Text;

import java.io.IOException;
import java.util.Map;

public class AnalysisUpMapper extends TableMapper<Text,Text> {
    // 防止数据过大，以千为单位
    public String getK(String num){
        float numk = Float.parseFloat(num);
        numk = numk/1000;
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
        String up = new String(kvPair.get(Bytes.toBytes("up")),"utf-8");    // utf-8必须，否则会乱码
        String view = new String(kvPair.get(Bytes.toBytes("view")));
        String danmaku = new String(kvPair.get(Bytes.toBytes("danmaku")));
        String like = new String(kvPair.get(Bytes.toBytes("like")));
        String coin = new String(kvPair.get(Bytes.toBytes("coin")));
        String collect = new String(kvPair.get(Bytes.toBytes("collect")));
        String share = new String(kvPair.get(Bytes.toBytes("share")));
        // 将数据拼接，传给reducer
        String data = getK(view)+"_"+danmaku+"_"+getK(like)+"_"+getK(coin)+"_"+getK(collect)+"_"+getK(share);

        context.write(new Text(up),new Text(data));
        // key: cate    用于聚集数据，reducer会将key相同的值放在一起处理
        // value: data
    }
}
