package com.jiang.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.jiang.controller.utils.R;
import com.jiang.domain.Book;
import com.jiang.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * @author jiangronghua
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll() {
        return new R(true, bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException {
        if(book.getName().equals("123")) throw new IOException();
        boolean flag = bookService.saveBook(book);
        return new R(flag, flag ? "添加成功^_^" : "添加失败^_^!");
    }

    @PutMapping
    public R update(@RequestBody Book book) {
        return new R(bookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        return new R(bookService.delete(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, bookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize) {
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        // 如果当前页码值大于了总页码值，那么重新执行查询操作，使用最大页码值作为当前页码值
        if (currentPage > page.getPages()) {
            page = bookService.getPage((int)page.getPages(), pageSize);
        }
        return new R(true, page);
    }

}
