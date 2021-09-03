package com.example.spring.my_webApplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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
