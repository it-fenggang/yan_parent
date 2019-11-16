package com.yan.base.service;


import com.yan.base.mapper.LabelMapper;
import com.yan.base.pojo.Label;
import com.yan.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 标签Service
 */
@Service
public class LabelService {

    @Autowired
    private LabelMapper labelMapper;

    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有
     */
    public List<Label> findAll(){
        return labelMapper.getAll();
    }

}
