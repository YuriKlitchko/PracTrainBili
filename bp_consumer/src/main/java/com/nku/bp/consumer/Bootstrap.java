package com.nku.bp.consumer;

import com.nku.bp.common.bean.Consumer;
import com.nku.bp.consumer.bean.DataConsumer;

import java.io.IOException;

public class Bootstrap {
    public static void main(String[] args) throws IOException {
        //创建消费者
        Consumer consumer = new DataConsumer();
        //消费数据
        consumer.consumer();
        //关闭资源
        consumer.close();
    }
}
