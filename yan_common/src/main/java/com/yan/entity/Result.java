package com.yan.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应实体
 */
@Data
public class Result implements Serializable {

    private Boolean flag;//是否成功
    private Integer code;//相应码
    private String message;//相应消息
    private Object data;//相应业务内容

    public Result(Boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }
    public Result(Boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result() {
    }
}
