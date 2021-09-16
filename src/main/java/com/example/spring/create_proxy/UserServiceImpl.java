package com.example.spring.create_proxy;

import org.springframework.stereotype.Service;

/**
 * @Author: hongming
 * @Date: 2021/09/15/18:34
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService{

    @Override
    public String getUser(String name) {
        System.out.println("用户姓名是：" + name);
        String sex = "男";
        return name + ",性别：" + sex;
    }
}
