package com.example.springListener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @Author: hongming
 * @Date: 2024/03/16/14:02
 * @Description:实现ApplicationListener接口，触发监听器
 */
@Configuration
public class TestApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // ContextRefreshedEvent 监听 ApplicationContextEvent。当spring容器执行完成，
        // 则会触发ContextRefreshedEvent刷新
        if (event.getApplicationContext().getParent() == null) {
            // 防止重复执行
            System.out.println("执行TestApplicationListener监听类方法");
        }
    }
}
