package com.jiang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;


/**
 * @author jiangronghua
 */
@SpringBootTest
public class StringRedisTemplateTest {

    @Autowired(required = false)
    private StringRedisTemplate stringRedisTemplate;

    @Test
    void get() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        String name = ops.get("name");
        System.out.println(name);
    }

}
