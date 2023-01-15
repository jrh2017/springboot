package com.jiang.service.impl.rabbitmq.topic.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
// @Component
public class MessageListener {
    @RabbitListener(queues = "topic_queue")
    public void revice(String id) {
        System.out.println("已完成发送短信发送业务(rabbitmq topic 1)，id: " + id);
    }

    @RabbitListener(queues = "topic_queue2")
    public void revice2(String id) {
        System.out.println("已完成发送短信发送业务(rabbitmq topic 2)，id: " + id);
    }
}
