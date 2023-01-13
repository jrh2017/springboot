package com.jiang.service;

import com.jiang.domain.Book;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface BookService {
    public Boolean save(Book book);
    public Book getById(Integer id);
    public Boolean update(Book book);
    public Boolean delete(Integer id);
    public List<Book> getAll();
}
