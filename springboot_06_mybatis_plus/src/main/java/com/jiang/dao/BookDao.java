package com.jiang.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jiang.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author jiangronghua
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
