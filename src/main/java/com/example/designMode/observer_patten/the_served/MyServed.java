package com.example.designMode.observer_patten.the_served;

import java.util.Observable;
import java.util.Vector;

public class MyServed extends Observable{

    private String param;


    public MyServed(String param) {
        this.param = param;
    }


    public void myNotifyObservers() {
        setChanged();
        notifyObservers(param);
    }
}
