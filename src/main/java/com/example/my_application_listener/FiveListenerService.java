package com.example.my_application_listener;

import com.example.my_application_listener.model.FiveEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 使用springApplication.addListeners(监听类)去添加自定义监听类
 */
@Service
public class FiveListenerService implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof FiveEvent) {
            String message = "用户id=" + ((FiveEvent) applicationEvent).getUserId() + "，  用户名称=" + ((FiveEvent) applicationEvent).getUserName();
            System.out.println(message);
            ((FiveEvent) applicationEvent).setMessage(message);
        }
    }
}
