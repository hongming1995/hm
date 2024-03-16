package com.example.designMode.myThreadPool;

import com.example.designMode.MyThreadPoolExecutor.MyRejectedExecutionHandler;

import java.util.concurrent.*;

/**
 * @Author: hongming
 * @Date: 2024/03/09/16:19
 * @Description:
 */
public class MyThreadPoolExecutor {

    public static ThreadPoolExecutor getThreadPoolExecutor() {
        /***
         * corePoolSize:核心线程数
         * maximumPoolSize：最大线程数
         * keepAliveTime：线程空闲时间
         * unit：时间单位：秒、分或者时
         * workQueue：任务队列
         * handler:拒绝策略
         */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 8,
                60, TimeUnit.SECONDS, new SynchronousQueue<>(), new MyRejectedExecutionHandler());
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor getArrayBlockingQueue() {
        /**
         * corePoolSize:核心线程数
         * maximumPoolSize：最大线程数
         * keepAliveTime：线程空闲时间
         * unit：时间单位：秒、分或者时
         * workQueue：有界且有设置长度的任务队列：20
         * handler:拒绝策略
        */
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10,
                60, TimeUnit.SECONDS, workQueue, new MyRejectedExecutionHandler());
        return threadPoolExecutor;
    }
}
