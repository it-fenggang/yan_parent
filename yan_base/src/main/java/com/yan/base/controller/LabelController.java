package com.yan.base.controller;

import com.yan.base.pojo.Label;
import com.yan.base.service.LabelService;
import com.yan.entity.Result;
import com.yan.entity.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * 标签Controller
 */
@RestController
@RequestMapping("/label")
@CrossOrigin //处理跨域问题
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 查询所有
     */
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    public Result findAll(){
        return new Result(true, StatusCode.OK,StatusCode.GET_0K,labelService.findAll());
    }

    /**
     * 查询一个
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable String id){
        return new Result(true,StatusCode.OK,StatusCode.GET_0K,labelService.findById(id));
    }

    /**
     * 添加
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    public Result add(@RequestBody Label label){
        labelService.add(label);
        return new Result(true,StatusCode.OK,StatusCode.ADD_0K);
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@RequestBody Label label,@PathVariable String id){
        label.setId(id);
        labelService.update(label);
        return new Result(true,StatusCode.OK,StatusCode.UPDATE_0K);
    }

    /**
     * 删除
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable String id){
        labelService.deleteById(id);
        return new Result(true,StatusCode.OK,StatusCode.DELETE_OK);
    }

}
