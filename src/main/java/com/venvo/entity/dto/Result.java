package com.venvo.entity.dto;

import lombok.Data;
/**
 * @author venvo
 * @date 2021-03-05 14:45
 * @description
 * @modified By
 * @version: jdk1.8
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;
}
