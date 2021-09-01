package com.example.my_application_listener.model;

import org.springframework.context.ApplicationEvent;

/**
 * 继承ApplicationEvent出发监听事件
 */
public class MyEvent extends ApplicationEvent {

    private String userId;

    private String userName;

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public MyEvent(Object source, String userId, String userName) {
        super(source);
        this.userId = userId;
        this.userName = userName;
    }
}
