package com.example.my_batis.service;

import com.example.mapper.user_mybatis.UserMapper;
import com.example.my_batis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hongming
 * @Date: 2021/09/18/1:43
 * @Description:
 */
@Service
public class UserMyBatisService {

    @Autowired
    private UserMapper userMapper;

    public Integer insert(User user) {
        return userMapper.insert(user);
    }
}
