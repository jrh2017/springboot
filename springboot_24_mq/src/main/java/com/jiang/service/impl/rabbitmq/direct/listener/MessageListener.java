package com.jiang.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
// @Component
public class MessageListener {
    @RabbitListener(queues = "direct_queue")
    public void revice(String id) {
        System.out.println("已完成发送短信发送业务(rabbitmq direct)，id: " + id);
    }
}
