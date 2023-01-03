package com.jiang.dao.impl;

import com.jiang.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author jiangronghua
 */
@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao is running .....");
    }
}
