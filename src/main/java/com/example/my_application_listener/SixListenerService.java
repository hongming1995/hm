package com.example.my_application_listener;

import com.example.my_application_listener.model.SixEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * 使用@EventListener 注解管理自定义监听类
 */
@Service
public class SixListenerService{

    @EventListener
    public void getListener(SixEvent sixEvent){
        String message = "用户id=" + sixEvent.getUserId() + ",  用户名称=" + sixEvent.getUserName();
        System.out.println(message);
        sixEvent.setMessage(message);
    }

}
