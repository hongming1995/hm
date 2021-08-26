package com.example.demo;

import com.example.ThreadLock.MyLock;
import com.example.ThreadLock.MySynchronized;
import com.example.designMode.MyThreadPoolExecutor.MyThreadPool;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySynchronizedTest {

    @Autowired
    private MySynchronized mySynchronized;
    @Autowired
    private MyLock myLock;

    private ThreadPoolExecutor threadPoolExecutor = MyThreadPool.getPool();

    @Test
    public void test() throws InterruptedException{
        for (int i = 0; i < 15; i++) {
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    mySynchronized.setData(1);
                }
            });
        }
        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("最后参数值是：" + mySynchronized.getData());

    }

    @Test
    public void test2() throws InterruptedException{
        for (int i = 0; i < 20; i++) {
            threadPoolExecutor.submit(new Runnable() {
                @Override
                public void run() {
                    myLock.setData(1);
                }
            });
        }
        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("最后参数值是：" + myLock.getData());

    }
}
