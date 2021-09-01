package com.example.my_application_listener;

import com.example.my_application_listener.model.MyEvent;
import com.example.my_application_listener.model.ThreeEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 使用spring.factories配置文件管理监听类
 */
public class FactoriesListenerService implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof ThreeEvent) {
            String message = "用户id=" + ((ThreeEvent) applicationEvent).getUserId() + "，  用户名称=" + ((ThreeEvent) applicationEvent).getUserName();
            System.out.println(message);
            ((ThreeEvent) applicationEvent).setMessage(message);
        }
    }
}
