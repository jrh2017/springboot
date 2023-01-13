package com.jiang.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jiangronghua
 */
@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
