package com.jiang.service.impl.rabbitmq.topic;

import com.jiang.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiangronghua
 */
@Service
public class MessageServiceRabbitmqTopicImpl implements MessageService {

    @Resource
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列(rabbitmq topic)，id: " + id);
        amqpTemplate.convertAndSend("topicExchange", "topic.orders.id", id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
