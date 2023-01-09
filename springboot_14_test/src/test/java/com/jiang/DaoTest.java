package com.jiang;

import com.jiang.domain.Book;
import com.jiang.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author jiangronghua
 */
@SpringBootTest
@Transactional
// @Rollback(value = false)
public class DaoTest {
    @Autowired
    private BookService bookService;

    @Test
    void testSave() {
        Book book = new Book();
        book.setName("springboot3");
        book.setType("springboot3");
        book.setDescription("springboot3");
        bookService.save(book);
    }

}
