package com.example.designMode.observer_patten.observice;

import org.springframework.util.StringUtils;

import java.util.Observable;
import java.util.Observer;

public class ThreeObService implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ThreeObService调用成功" + (!StringUtils.isEmpty(arg) ? "参数为:" + arg : ""));
    }
}
