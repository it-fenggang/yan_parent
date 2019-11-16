package com.yan.user.pojo;

import com.yan.entity.BasePo;
import lombok.Data;

/**
 * @author FG
 * @version 1.0
 * @date 2019/11/16 21:42
 * @description
 */
@Data
public class User extends BasePo {
    private String id;
    private String login;//用户名
    private String password;//密码
    private String name;//名称
    private String phone;//联系电话
    private String roleid;//角色编号
    private String headurl;//头像
}
