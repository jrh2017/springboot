package com.jiang.service.impl;

import com.jiang.service.SendMailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author jiangronghua
 */
@Service
public class SendMailServiceImpl implements SendMailService {
    
    @Resource
    private JavaMailSender javaMailSender;
    private String from = "";
    private String to = "";
    private String subject = "测试邮件";
    private String context = "<img src='https://bkimg.cdn.bcebos.com/pic/8326cffc1e178a82b901a69b0b52648da977391242f7' /><a href='https://htd.cn'>测试邮件正文内容</a>";
    
    @Override
    public void sendMail() {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(from + "(小甜甜)");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(context, true);
            File f1 = new File("/Users/jiangronghua/workspace/code/java/springboot/springboot_23_mail/target/springboot_23_mail-0.0.1-SNAPSHOT.jar");
            File f2 = new File("/Users/jiangronghua/workspace/code/java/springboot/springboot_23_mail/src/main/resources/logo.png");
            helper.addAttachment(f1.getName(), f1);
            helper.addAttachment("最靠谱的培训机构", f2);
            javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
