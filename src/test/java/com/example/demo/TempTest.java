package com.example.demo;

import com.example.designMode.template.TempApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TempTest {

    @Autowired
    private TempApplication tempApplication;

    @Test
    public void test1() {
        tempApplication.doPay("yiban");
    }

    @Test
    public void test2() {
        tempApplication.doPay("third");
    }
}
