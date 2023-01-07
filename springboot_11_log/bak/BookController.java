package com.jiang.controller.bak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangronghua
 */
@RestController
@RequestMapping("/books")
public class BookController extends BaseClass{

    // 创建记录日志对象
    // private static final Logger log = LoggerFactory.getLogger(BookController.class);

    @GetMapping
    public String getById() {
        System.out.println("springboot is running ....");
        log.debug("debug...");
        log.info("info....");
        log.warn("warn...");
        log.error("error....");
        return "springboot is running ....";
    }
}
