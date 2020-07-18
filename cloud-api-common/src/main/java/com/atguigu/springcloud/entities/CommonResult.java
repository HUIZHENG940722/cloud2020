package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: HUIZHENG
 * @Description: 传给前端的实体类
 * @Date: 2020/7/4 17:34
 * @Version: 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String message;
    private T       data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
