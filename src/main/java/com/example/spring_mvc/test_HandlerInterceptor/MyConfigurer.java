package com.example.spring_mvc.test_HandlerInterceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: hongming
 * @Date: 2021/10/13/23:19
 * @Description: 配置拦截器的类
 */
@Configuration
public class MyConfigurer implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        registry.addInterceptor(getMyHandler()).addPathPatterns("/**");
    }

    @Bean
    public MyHandlerInterceptor getMyHandler() {
        return new MyHandlerInterceptor();
    }
}
