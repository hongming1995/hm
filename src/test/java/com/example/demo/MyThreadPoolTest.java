package com.example.demo;

import com.example.designMode.MyThreadPoolExecutor.MyThreadPool;
import com.example.designMode.MyThreadPoolExecutor.ThreadBody;
import com.example.designMode.MyThreadPoolExecutor.ThreadPoolInit;
import com.example.designMode.testThreadLocal.MyThreadLocal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyThreadPoolTest {

    @Autowired
    private ThreadPoolInit threadPoolInit;

    /**
     * 测试队列中等待核心线程执行完再执行
     * @throws Exception
     */
    @Test
    public void test() throws Exception{
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < 8; i++) {
            MyThreadLocal.setMapValue(i + "");
            getData(startTime);
        }
        Thread.sleep(10000);
    }

    /**
     * 测试超出最大线程数后执行放弃策略
     * @throws Exception
     */
    @Test
    public void test2() throws Exception{
        final long startTime = System.currentTimeMillis();
        for (int i = 0; i < 13; i++) {
            MyThreadLocal.setMapValue(i + "");
            getData(startTime);
        }
        Thread.sleep(10000);
    }

    public void getData(final long startTime) {
        String i = MyThreadLocal.getMapValue();
        ThreadBody threadBod = new ThreadBody(i + "", "线程" + i, new Runnable() {
            @Override
            public void run(){
                try {
                    System.out.println("线程"+ i +"执行：" + (System.currentTimeMillis() - startTime));
                    Thread.sleep(1000);
                    System.out.println("线程" + i + "执行完成");
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        threadPoolInit.getInitPool("pms", threadBod);
    }
}
