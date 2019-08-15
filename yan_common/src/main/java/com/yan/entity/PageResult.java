package com.yan.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 分页相应实体
 */
@Data
public class PageResult<T> implements Serializable {
    private Long total;//总记录数
    private List<T> rows;//当前页数据列表

    public PageResult() {
    }
    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
