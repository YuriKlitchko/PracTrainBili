package com.nku.bp.consumer.dao;

import com.nku.bp.common.bean.BaseHBaseDao;
import com.nku.bp.common.constant.Names;
import com.nku.bp.common.constant.ValueConstant;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HBaseDao extends BaseHBaseDao {

    /**
     * 初始化
     */
    public void init() throws IOException {
        start();//开始

        createNamespaceNX(Names.NAMESPACE.getValue());//创建命名空间
        createTableXX(Names.TABLE.getValue(),
                ValueConstant.REGION_COUNT,
                Names.INFO.getValue()   // 一个列族即可
        );//创建表

        end();//结束
    }

    /**
     * 插入数据
     * @param value
     */
    public void insertData(String value) throws Exception {
        //将视频数据保存到HBase表中
        //1.获取视频数据

        String[] values = value.split(",");
        String category = values[0];
        String rank = values[1];
        while(rank.length()<3){
            rank='0'+rank;
        }

        String bv = values[values.length-1];
        String share = values[values.length-2];
        String collect = values[values.length-3];
        String coin = values[values.length-4];
        String like = values[values.length-5];
        String danmaku = values[values.length-6];
        String view = values[values.length-7];
        String up = values[values.length-8];
        String name = values[values.length-9];

        //2.创建数据对象
        // rowKey = bv_rank，比如 137e1y4pJ1VB_940
        String reverseBv = new StringBuffer(bv).reverse().toString();
        String rowKey= reverseBv+"_"+rank;
        Put put=new Put(Bytes.toBytes(rowKey));
        //列族
        byte[] family=Bytes.toBytes(Names.INFO.getValue());
        //增加列
        put.addColumn(family,Bytes.toBytes("cate"),Bytes.toBytes(category));    // 分区
        put.addColumn(family,Bytes.toBytes("rank"),Bytes.toBytes(rank));        // 排名
        put.addColumn(family,Bytes.toBytes("name"),Bytes.toBytes(name));        // 视频名
        put.addColumn(family,Bytes.toBytes("up"),Bytes.toBytes(up));            // up
        put.addColumn(family,Bytes.toBytes("view"),Bytes.toBytes(view));        // 播放量
        put.addColumn(family,Bytes.toBytes("danmaku"),Bytes.toBytes(danmaku));  // 弹幕数
        put.addColumn(family,Bytes.toBytes("like"),Bytes.toBytes(like));        // 点赞
        put.addColumn(family,Bytes.toBytes("coin"),Bytes.toBytes(coin));        // 投币
        put.addColumn(family,Bytes.toBytes("collect"),Bytes.toBytes(collect));  // 收藏
        put.addColumn(family,Bytes.toBytes("share"),Bytes.toBytes(share));      // 分享
        put.addColumn(family,Bytes.toBytes("bv"),Bytes.toBytes(bv));            // bv号

        //3.保存数据
        putData(Names.TABLE.getValue(),put);
    }
}
