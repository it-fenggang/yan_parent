package com.yan.base.dao;

import com.yan.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 标签dao
 */
public interface LabelDao extends JpaRepository<Label,String>{
}
