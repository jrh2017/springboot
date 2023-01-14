package com.jiang.service.impl;

import com.jiang.service.SendMailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author jiangronghua
 */
// @Service
public class SendMailServiceImpl2 implements SendMailService {
    
    @Resource
    private JavaMailSender javaMailSender;
    private String from = "";
    private String to = "";
    private String subject = "测试邮件";
    private String context = "测试邮件正文内容";
    
    @Override
    public void sendMail() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from + "(小甜甜)");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(context);
        javaMailSender.send(message);
    }
}
