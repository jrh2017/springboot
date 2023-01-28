package com.jiang.bean;

import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component("tom")
public class Cat {
    int age;
    public Cat() {};

    public Cat(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}
