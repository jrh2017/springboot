package com.jiang.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jiang.Dao.BookDao;
import com.jiang.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author jiangronghua
 */
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;
    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(51);
        book.setType("测试数据123efd");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(52);
    }

    @Test
    void testGetAll(){
        bookDao.selectList(null);
    }

    @Test
    void testGetPage(){
        IPage page = new Page(2, 5);
        bookDao.selectPage(page, null);
        System.out.println(page.getCurrent());
        System.out.println(page.getSize());
        System.out.println(page.getPages());
        System.out.println(page.getTotal());
        System.out.println(page.getRecords());
    }

    @Test
    void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "Spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2(){
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null, Book::getName, name);
        bookDao.selectList(lqw);
    }
}
