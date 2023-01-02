package com.jiang;

import com.jiang.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0101QuickstartApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot0101QuickstartApplication.class, args);
        BookController bean = ctx.getBean(BookController.class);
        User user = ctx.getBean(User.class);
        System.out.println("bean=======>" + bean);
        System.out.println("user=======>" + user);
    }

}
