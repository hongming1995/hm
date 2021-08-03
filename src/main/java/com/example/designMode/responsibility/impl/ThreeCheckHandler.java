package com.example.designMode.responsibility.impl;

import com.example.designMode.responsibility.Handler.NumberHandler;
import org.springframework.stereotype.Service;

@Service
public class ThreeCheckHandler extends NumberHandler {
    @Override
    public void getMessage(String status) {
        if ("3".equals(status)) {
            System.out.println("校验的是" + status);
        } else {
            System.out.println("无校验条件");
        }
    }
}
