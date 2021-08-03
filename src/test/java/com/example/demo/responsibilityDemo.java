package com.example.demo;

import com.example.designMode.responsibility.Handler.NumberHandler;
import com.example.designMode.responsibility.impl.OneCheckHandler;
import com.example.designMode.responsibility.impl.ThreeCheckHandler;
import com.example.designMode.responsibility.impl.TwoCheckHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class responsibilityDemo {

    @Test
    public void test1() {
        NumberHandler one = new OneCheckHandler();
        NumberHandler two = new TwoCheckHandler();
        NumberHandler three = new ThreeCheckHandler();
        one.setNumberHandler(two);
        two.setNumberHandler(three);
        one.getMessage("2");
    }

    @Test
    public void test2() {
        NumberHandler one = new OneCheckHandler();
        NumberHandler two = new TwoCheckHandler();
        NumberHandler three = new ThreeCheckHandler();
        one.setNumberHandler(two);
        two.setNumberHandler(three);
        one.getMessage("3");
    }

    @Test
    public void test3() {
        NumberHandler one = new OneCheckHandler();
        NumberHandler two = new TwoCheckHandler();
        NumberHandler three = new ThreeCheckHandler();
        one.setNumberHandler(two);
        two.setNumberHandler(three);
        one.getMessage("1");
    }

    @Test
    public void test4() {
        NumberHandler one = new OneCheckHandler();
        NumberHandler two = new TwoCheckHandler();
        NumberHandler three = new ThreeCheckHandler();
        one.setNumberHandler(two);
        two.setNumberHandler(three);
        one.getMessage("4");
    }
}
