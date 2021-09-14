package com.example.spring.my_webApplicationContextAware;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyWebApplicationContext {
    private MyTestServiceImpl myTestService;

    @Autowired
    private ApplicationContextUtil applicationContextUtil;

    private void init() {
        myTestService = applicationContextUtil.getContext().getBean(MyTestServiceImpl.class);
    }

    public void getMessage() {
        init();
        System.out.println("=====执行前====");
        myTestService.getMessage();
        System.out.println("======执行结束========");
    }
}
