package com.example.MyThreadPool;

import com.example.simpleThread.MyWorkPoolThread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hongming
 * @Date: 2025/02/13/20:15
 * @Description: 创建ThreadPoolExecutor线程池，使用默认的拒绝策略：AbortPolicy
 */
public class MyThreadPoolExecutors {
    public static void main(String[] args) {
        ThreadPoolExecutor thread = new ThreadPoolExecutor(3,
                10,
                60,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.AbortPolicy());

        for (int i = 0; i < 10; i++) {
            thread.execute(new MyWorkPoolThread(i + 1));
        }
    }
}
