package com.example.demo;

import com.example.designMode.MyThreadPoolExecutor.MyThreadPool;
import com.example.designMode.MyThreadPoolExecutor.ThreadBody;
import com.example.designMode.MyThreadPoolExecutor.ThreadPoolInit;
import com.example.thread_test.MyThreadCharacter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyThreadTest {

    @Autowired
    private MyThreadCharacter myThreadCharacter;

    private ThreadPoolExecutor threadPoolExecutor = MyThreadPool.getPool();

    @Test
    public void test() throws Exception{
        for (int i = 0; i < 200; i++) {
            //long startTime = System.currentTimeMillis();
            final int j = i;
            ThreadBody threadBody = new ThreadBody(j + "", "线程" + j, new Runnable() {
                @Override
                public void run() {
                    myThreadCharacter.getData(j);
                }
            });
            Thread.sleep(2);
            threadPoolExecutor.submit(threadBody.getRunnable());
        }
        //threadPoolExecutor.shutdown();
        //threadPoolExecutor.awaitTermination(20, TimeUnit.SECONDS);

        //System.out.println(myThreadCharacter.getList().toString());
    }
}
