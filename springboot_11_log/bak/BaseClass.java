package com.jiang.controller.bak;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jiangronghua
 */
public class BaseClass {
    private Class clazz;
    public Logger log;

    public BaseClass() {
        clazz = this.getClass();
        log = LoggerFactory.getLogger(clazz);
    }
}
