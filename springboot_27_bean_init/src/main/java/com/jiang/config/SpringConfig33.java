package com.jiang.config;

import com.jiang.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author jiangronghua
 */
@Configuration(proxyBeanMethods = false)
public class SpringConfig33 {

    @Bean
    public Cat cat() {
        return  new Cat();
    }

}
