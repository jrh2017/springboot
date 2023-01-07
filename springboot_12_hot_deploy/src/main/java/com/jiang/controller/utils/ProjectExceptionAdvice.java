package com.jiang.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jiangronghua
 * SpringMVC 异常处理器
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    @ExceptionHandler
    public R doException(Exception ex) {
        ex.printStackTrace();
        return new R("服务器故障，请稍后再试");
    }
}
