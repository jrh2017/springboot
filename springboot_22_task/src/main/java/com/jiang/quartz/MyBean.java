package com.jiang.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
public class MyBean {
    @Scheduled(cron = "0/1 * * * * ?")
    public void print() {
        System.out.println(Thread.currentThread().getName() + " spring task run ....");
    }
}
