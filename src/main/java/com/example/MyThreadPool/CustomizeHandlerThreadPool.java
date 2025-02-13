package com.example.MyThreadPool;

import com.example.MyRejectedExecutionHandler.MyRejectedExecutionHandler;
import com.example.simpleThread.MyWorkPoolThread;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hongming
 * @Date: 2025/02/13/21:03
 * @Description: 自定义拒绝策略ThreadPoolExecutor线程池
 */
public class CustomizeHandlerThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor thread = new ThreadPoolExecutor(3,
                10,
                60,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new MyRejectedExecutionHandler());

        for (int i = 0; i < 12; i++) {
            thread.execute(new MyWorkPoolThread(i + 1));
        }
    }
}
