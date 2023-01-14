package com.jiang.controller;

import com.jiang.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangronghua
 */
@RestController
@RequestMapping("/msgs")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String doMessage() {
        String id = messageService.doMessage();
        return id;
    }

}
