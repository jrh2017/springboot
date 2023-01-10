package com.jiang.testcase.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
@Data
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {
    private int id;
    private String name;
    private String uuid;
    private long publishTime;
}
