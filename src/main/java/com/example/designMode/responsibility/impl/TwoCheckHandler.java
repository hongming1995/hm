package com.example.designMode.responsibility.impl;

import com.example.designMode.responsibility.Handler.NumberHandler;
import org.springframework.stereotype.Service;

@Service
public class TwoCheckHandler extends NumberHandler {
    @Override
    public void getMessage(String status) {
        if ("2".equals(status)) {
            System.out.println("校验的是" + status);
        } else {
            super.getNumberHandler().getMessage(status);
        }
    }
}
