package com.jiang.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
// @Component
public class MessageListener {

    @JmsListener(destination = "order.queue.id")
    @SendTo("order.other.queue.id")
    public String revice(String id) {
        System.out.println("已完成发送短信发送业务，id: " + id);
        return "new:" + id;
    }
}
