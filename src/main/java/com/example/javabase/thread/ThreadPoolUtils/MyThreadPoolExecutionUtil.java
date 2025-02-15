package com.example.javabase.thread.ThreadPoolUtils;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hongming
 * @Date: 2025/02/15/22:21
 * @Description: 创建ThreadPoolExecutor线程池
 */
public class MyThreadPoolExecutionUtil {

    public static ThreadPoolExecutor getThreadPoolExecutor() {
        ThreadPoolExecutor thread = new ThreadPoolExecutor(3,
                10,
                60,
                TimeUnit.SECONDS,
                new SynchronousQueue<>(),
                new ThreadPoolExecutor.AbortPolicy());
        return thread;
    }
}
