package com.manage.utils;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Description 全局统一返回对象
 * @auther liujiajia
 * @create 2019-11-11
 */

@Builder
@ToString
@Accessors(chain = true)
@AllArgsConstructor
public class R<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private int code = 200;
    // success 返回正常数据json
    // fail 返回通用的错误码

    @Getter
    @Setter
    private String msg = "success";

    @Getter
    @Setter
    private T data;

    public R() {
        super();
    }

    public R(T data) {
        super();
        this.data = data;
    }

    public R(T data, String msg) {
        super();
        this.data = data;
        this.msg = msg;
    }

    public R(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }
}
