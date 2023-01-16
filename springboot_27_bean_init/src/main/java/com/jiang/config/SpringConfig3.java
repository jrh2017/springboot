package com.jiang.config;

import com.jiang.bean.Dog;
import com.jiang.bean.DogFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author jiangronghua
 */
@ComponentScan({"com.jiang.bean", "com.jiang.config"})
public class SpringConfig3 {
    @Bean
    public DogFactoryBean dog() {
        return new DogFactoryBean();
    }
}
