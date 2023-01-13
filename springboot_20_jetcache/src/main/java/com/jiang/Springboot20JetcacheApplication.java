package com.jiang;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// jetcache启用缓存的开关
@EnableCreateCacheAnnotation
// 开启方法注解缓存
@EnableMethodCache(basePackages = "com.jiang")
public class Springboot20JetcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot20JetcacheApplication.class, args);
    }

}
