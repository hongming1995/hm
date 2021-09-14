package com.example.demo;

import com.example.spring.my_webApplicationContextAware.MyWebApplicationContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyApplicationContextTest {
    @Autowired
    private MyWebApplicationContext myWebApplicationContext;

    @Test
    public void test() {
        myWebApplicationContext.getMessage();
    }
}
