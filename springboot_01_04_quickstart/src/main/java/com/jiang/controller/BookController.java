package com.jiang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangronghua
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById() {
        System.out.println("springboot is running4 ....");
        return "springboot is running4 ....";
    }
}
