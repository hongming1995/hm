package com.example.my_application_listener;

import com.example.my_application_listener.model.FourEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 使用application.properties配置文件context.listener.classes去管理自定义监听类
 */
public class PropertiesListenerService implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof FourEvent) {
            String message = "用户id=" + ((FourEvent) applicationEvent).getUserId() + "，  用户名称=" + ((FourEvent) applicationEvent).getUserName();
            System.out.println(message);
            ((FourEvent) applicationEvent).setMessage(message);
        }
    }
}
