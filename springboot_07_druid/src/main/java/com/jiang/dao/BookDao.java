package com.jiang.dao;

import com.jiang.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author jiangronghua
 */
@Mapper
public interface BookDao {

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
