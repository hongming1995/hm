package com.example.MyThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hongming
 * @Date: 2025/02/11/22:29
 * @Description:
 */
public class MyNewScheduledThreadPool {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        // 第二个参数延迟多长时间
        executor.schedule(new MyRunnablePool(), 5, TimeUnit.SECONDS);
    }
}
