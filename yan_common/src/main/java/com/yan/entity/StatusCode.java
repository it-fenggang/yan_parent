package com.yan.entity;

/**
 * 状态码常量类
 */
public class StatusCode {
    /**
     * 返回数据状态
     */
    public static final Integer OK = 20000;//成功
    public static final Integer ERROR = 20001;//失败
    public static final Integer USER_PASS_ERROR = 20002;//用户名或密码错误
    public static final Integer ACCESS_ERROR = 20003;//权限不足
    public static final Integer REMOTE_ERROR = 20004;//远程调用失败
    public static final Integer REPEATE_ERROR = 20005;//重复操作
    /**
     * 字段state状态(0=删除,1=可用)
     */
    public static final Integer STATE_OK = 1;//可用
    public static final Integer STATE_DEL = 0;//删除
    /**
     * 操作状态
     */
    public static final String GET_0K = "查询成功";
    public static final String UPDATE_0K = "修改成功";
    public static final String DELETE_OK = "删除成功";
    public static final String ADD_0K = "新增成功";
    public static final String POST_ERROR = "请求错误";

}
