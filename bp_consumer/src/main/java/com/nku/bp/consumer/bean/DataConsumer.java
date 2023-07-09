package com.nku.bp.consumer.bean;

import com.nku.bp.common.bean.Consumer;
import com.nku.bp.common.constant.Names;
import com.nku.bp.consumer.dao.HBaseDao;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;


public class DataConsumer implements Consumer {

    // consume data
    @Override
    public void consumer() throws IOException {
        try {
            Properties properties=new Properties();
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("consumer.properties"));
            // 使用kafka，获取flume采集的数据
            KafkaConsumer<String,String> consumer=new KafkaConsumer<String, String>(properties);

            // 关注主题 bp (bilibili project)
            consumer.subscribe(Arrays.asList(Names.TOPIC.getValue()));

            // Hbase数据访问对象
            HBaseDao dao = new HBaseDao();
            // 初始化
            dao.init();

            //消费数据
            while(true){
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
                for (ConsumerRecord<String, String> record : records) {

                    System.out.println(record.value());
                    //插入数据
                    dao.insertData(record.value());

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void close() throws IOException {

    }
}
