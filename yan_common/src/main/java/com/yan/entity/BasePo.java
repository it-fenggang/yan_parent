package com.yan.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author FG
 * @version 1.0
 * @date 2019/11/16 20:49
 * @description
 */
@Data
public class BasePo implements Serializable {
    private int state;//状态(1=可用,2=冻结(取消),3=删除)
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;//创建时间
}
