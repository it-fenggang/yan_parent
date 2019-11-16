package com.yan.user.controller;

import com.yan.entity.Result;
import com.yan.entity.StatusCode;
import com.yan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FG
 * @version 1.0
 * @date 2019/11/16 21:51
 * @description
 */
@RestController
@RequestMapping("/user")
@CrossOrigin //处理跨域问题
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 查询所有
     */
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,StatusCode.GET_0K,userService.findAll());
    }

}
