package com.example.spring.spring_aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: hongming
 * @Date: 2021/09/15/17:23
 * @Description: 当前为一个切面类
 */
@Aspect
@Component
public class SpringAspect {

    @Pointcut("execution(public * com.example.spring.spring_aop.SpringProxyService.*(..))")
    public void pointCut() {}

    /**
    * @Author: hm
    * @Date: 2021/9/16
    * @Description: spring aop切面前置服务
    */
    @Before("pointCut()")
    public void before() {
        System.out.println("被代理对象执行前置服务");
    }

    /**
    * @Author: hm
    * @Date: 2021/9/16
    * @Description: spring aop 切面后置服务
    */
    @After("pointCut()")
    public void after() {
        System.out.println("被代理对象执行后置服务");
    }

    /**
    * @Author: hm
    * @Date: 2021/9/16
    * @Description: spring aop切面动态代理执行完成以后，无异常会执行的方法。@AfterThrowing注解执行完成后异常会执行的方法
    */
    @AfterReturning("pointCut()")
    public void afterRunning() {
        System.out.println("执行完成以后，提交事务");
    }
}
