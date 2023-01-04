package com.jiang.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jiang.domain.Book;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();
    IPage<Book> getPage(int currentPage, int pageSize);
}
