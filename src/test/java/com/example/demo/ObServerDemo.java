package com.example.demo;

import com.example.designMode.observer_patten.observice.OneObService;
import com.example.designMode.observer_patten.observice.ThreeObService;
import com.example.designMode.observer_patten.observice.TwoObService;
import com.example.designMode.observer_patten.the_served.MyServed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ObServerDemo {

    @Test
    public void test() {
        MyServed myServed = new MyServed("测试");
        OneObService one = new OneObService();
        TwoObService two = new TwoObService();
        ThreeObService three = new ThreeObService();
        myServed.addObserver(one);
        myServed.addObserver(two);
        myServed.addObserver(three);
        myServed.myNotifyObservers();
    }
}
