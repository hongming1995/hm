package com.example.spring.my_webApplicationcontext;

import org.springframework.stereotype.Service;

@Service
public class MyTestServiceImpl {

    public void getMessage() {
        System.out.println("使用WebApplicationContext获取对象执行");
    }
}
