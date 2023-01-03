package com.jiang;

import com.jiang.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = Springboot04JunitApplicationTests.class)
// @SpringBootTest(classes = Springboot04JunitApplicationTests.class)
class Springboot04JunitApplicationTests {
    @Autowired
    private BookDao bookDao;

    /**
     * 1. 注入你要测试的对象
     * 2. 执行要测试的对象对应的方法
     */
    @Test
    void contextLoads() {
        // System.out.println("test......");
        bookDao.save();
    }

}
