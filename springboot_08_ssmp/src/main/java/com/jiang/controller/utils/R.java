package com.jiang.controller.utils;

import lombok.Data;

/**
 * @author jiangronghua
 */
@Data
public class R {
    private Boolean flag;
    private Object data;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    };

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    };
}
