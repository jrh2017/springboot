package com.jiang.service.impl;

import com.jiang.service.MessageService;
import com.jiang.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangronghua
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;
    @Override
    public void order(String id) {
        // 一系列操作，包含各种服务调用，处理各种业务
        System.out.println("订单的处理开始");
        // 短信消息处理
        messageService.sendMessage(id);
        System.out.println("订单的处理结束");

        System.out.println();
    }
}
