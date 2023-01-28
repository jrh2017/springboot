package com.jiang.app;

import com.jiang.bean.Cat;
import com.jiang.bean.Dog;
import com.jiang.bean.Mouse;
import com.jiang.config.SpringConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiangronghua
 */
public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        ctx.registerBean("tom", Cat.class, 0);
        ctx.registerBean("tom", Cat.class, 1);
        ctx.registerBean("tom", Cat.class, 2);
        ctx.register(Mouse.class);
        String[] names = ctx.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("------------------");
        System.out.println(ctx.getBean(Cat.class));
    }
}
