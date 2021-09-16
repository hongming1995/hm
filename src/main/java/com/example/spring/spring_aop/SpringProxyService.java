package com.example.spring.spring_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

/**
 * @Author: hongming
 * @Date: 2021/09/15/17:19
 * @Description: 测试spring注解方式的动态代理
 * @EnableAspectJAutoProxy: 表示当前被代理对象
 */
@Service
public class SpringProxyService {

    public void springProxy(String name) {
        System.out.println(name + "执行被代理对象");
    }
}
