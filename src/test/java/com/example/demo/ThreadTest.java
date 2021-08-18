package com.example.demo;

import com.example.designMode.testThreadLocal.MyThread;
import com.example.designMode.testThreadLocal.MyThreadLocal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ThreadTest {
    
    @Autowired
    private MyThread myThread;



    /**
     * 测试ThreadLocal作用和场景
     */
    @Test
    public void test() {
        for (int i = 0; i < 3; i++) {
            List<String> data = init(i);
            myThread.getThread(data);
        }
        MyThreadLocal.removeThreadLocal();
    }

    @Test
    public void test1(){
        String num = "2";
        for (int i = 0; i < 3; i++) {
            myThread.getHaveLocal(num,i);
        }
    }
    
    public List<String> init(int i) {
        List<String> list = new ArrayList<>();
        if (i == 0) {
            list.add("0");
            list.add("2");
            list.add("4");
            list.add("6");
            list.add("8");
        }
        if (i == 1) {
            list.add("1");
            list.add("3");
            list.add("5");
            list.add("6");
            list.add("7");
        }
        if (i == 2) {
            list.add("6");
            list.add("7");
            list.add("8");
            list.add("9");
            list.add("10");
        }
        return list;
    }
}
