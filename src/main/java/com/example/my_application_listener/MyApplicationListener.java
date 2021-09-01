package com.example.my_application_listener;

import com.example.my_application_listener.model.MyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 使用最开始spring容器去管理监听类
 */
@Service
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof MyEvent) {
            String message = "===用户id=" + ((MyEvent) applicationEvent).getUserId() + ",用户名称=" + ((MyEvent) applicationEvent).getUserName() + "===";
            System.out.println(message);
            ((MyEvent) applicationEvent).setMessage(message);
        }
    }

    /*@Override
    public void onApplicationEvent(MyEvent myEvent) {
        String message = "===用户id=" + myEvent.getUserId() + ",用户名称=" + myEvent.getUserName() + "===";
        System.out.println(message);
        myEvent.setMessage(message);
    }*/
}
