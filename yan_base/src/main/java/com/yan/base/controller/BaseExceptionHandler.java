package com.yan.base.controller;

import com.yan.entity.Result;
import com.yan.entity.StatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理类
 */
@ControllerAdvice
public class BaseExceptionHandler {

    /**
     * 异常处理方法
     */
    @ExceptionHandler(value = Exception.class )
    @ResponseBody  //转换json格式注解不能省
    public Result error(Exception e){
        return new Result(false, StatusCode.ERROR,StatusCode.POST_ERROR+e.getMessage());
    }

}
