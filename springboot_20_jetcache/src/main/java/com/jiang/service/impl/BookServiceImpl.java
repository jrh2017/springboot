package com.jiang.service.impl;

import com.alicp.jetcache.anno.*;
import com.jiang.dao.BookDao;
import com.jiang.domain.Book;
import com.jiang.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author jiangronghua
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    @Cached(name="book_", key="#id", expire = 3600, cacheType = CacheType.LOCAL)
    // @CacheRefresh(refresh = 5)
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    @CacheUpdate(name="book_", key = "#book.id", value="#book")
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    @CacheInvalidate(name="book_", key = "#id")
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }
}
