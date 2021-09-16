package com.example.spring.create_proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Proxy;

/**
 * @Author: hongming
 * @Date: 2021/09/15/18:36
 * @Description: 执行动态代理
 */
@Service
public class MakeUserProxy {
    @Autowired
    private MyInvocationHandler myInvocationHandler;

    public void testProxy() {
        UserService user = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(), new Class[]{UserService.class}, myInvocationHandler);
        user.getUser("张三");
    }
}
