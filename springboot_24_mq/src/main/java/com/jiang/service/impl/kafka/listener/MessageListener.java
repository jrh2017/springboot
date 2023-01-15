package com.jiang.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
public class MessageListener {
    @KafkaListener(topics = "jiangronghua")
    public void onMessage(ConsumerRecord<String, String> record) {
        System.out.println("已完成发送短信发送业务(kafka)，record: " + record.value());
    }
}
