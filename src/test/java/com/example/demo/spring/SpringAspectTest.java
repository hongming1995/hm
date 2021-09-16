package com.example.demo.spring;

import com.example.spring.spring_aop.SpringProxyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: hongming
 * @Date: 2021/09/16/10:13
 * @Description: 测试aop注解动态代理
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAspectTest {

    @Autowired
    private SpringProxyService springProxyService;

    @Test
    public void test() {
        springProxyService.springProxy("张三");
    }
}
