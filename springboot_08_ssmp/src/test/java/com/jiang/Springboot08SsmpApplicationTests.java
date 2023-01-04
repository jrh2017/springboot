package com.jiang;

import com.jiang.Dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot08SsmpApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
    }

}
