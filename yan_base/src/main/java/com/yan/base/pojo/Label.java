package com.yan.base.pojo;

import com.yan.entity.BasePo;
import lombok.Data;
/**
 * 标签实体
 */
@Data
public class Label extends BasePo{

    private String id;//编号
    private String labelName;//标签名称
}
