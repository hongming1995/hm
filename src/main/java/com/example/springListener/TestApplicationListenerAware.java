package com.example.springListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: hongming
 * @Date: 2024/03/16/15:06
 * @Description:实现ApplicationContextAware接口触发监听器
 */
@Configuration
public class TestApplicationListenerAware implements ApplicationContextAware {

    private ApplicationContext context;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println("监听器触发，获取ApplicationContext容器");
    }
}
