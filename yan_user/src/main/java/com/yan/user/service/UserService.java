package com.yan.user.service;


import com.yan.user.mapper.UserMapper;
import com.yan.user.pojo.User;
import com.yan.util.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * 用户Service
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IdWorker idWorker;

    /**
     * 查询所有
     */
    public List<User> findAll(){
        return userMapper.getAll();
    }

}
