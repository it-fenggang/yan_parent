package com.yan.base.pojo;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 标签实体
 */
@Data
@Entity
@Table(name = "tb_label")
public class Label implements Serializable{

    @Id
    private String id;//编号
    private String labelname;//标签名称
    private Integer state;//状态(0=删除,1=可用)
}
