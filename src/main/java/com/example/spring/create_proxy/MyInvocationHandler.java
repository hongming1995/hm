package com.example.spring.create_proxy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: hongming
 * @Date: 2021/09/15/18:25
 * @Description: InvocationHandler实现类
 */
@Service
public class MyInvocationHandler implements InvocationHandler {

    @Autowired
    private UserService userService;
    /**
    * @Author: hm
    * @Param: proxy:调用该方法的代理实例 method：被代理类的方法 args：被代理的参数
    * @Date: 2021/9/15
    * @return: 
    * @Description: 
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行动态代理开始");
        // 动态执行目标代理对象
        Object value = method.invoke(userService, args);
        System.out.println("执行动态代理结束");
        return value;
    }
}
