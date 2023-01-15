package com.jiang.service.impl.kafka;

import com.jiang.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiangronghua
 */
@Service
public class MessageServiceKafkaImpl implements MessageService {

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列(kafka)，id: " + id);
        kafkaTemplate.send("jiangronghua", id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
