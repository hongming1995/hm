package com.example.demo;

import com.example.designMode.MyThreadPoolExecutor.MyExecutor;
import com.example.designMode.testThreadLocal.MyThreadLocal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyExcutor {
    @Autowired
    private MyExecutor myExecutor;

    @Test
    public void test() {
        for (int i = 0; i < 2; i++) {
            myExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程执行" + System.currentTimeMillis());
                }
            });
        }
    }
}
