package com.jiang.controller;

import com.jiang.domain.Book;
import com.jiang.service.BookService;
import com.jiang.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jiangronghua
 */
@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    @GetMapping("{tele}")
    public String get(@PathVariable String tele){
        return msgService.get(tele);
    }

    @PostMapping
    public boolean check(String tele, String code){
        return msgService.check(tele, code);
    }
}
