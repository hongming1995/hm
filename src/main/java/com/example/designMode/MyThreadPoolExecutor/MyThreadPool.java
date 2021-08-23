package com.example.designMode.MyThreadPoolExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class MyThreadPool {

    public static Map<String, ThreadPoolExecutor> threadMap = new HashMap<>();

    /**
     * 创建线程池
     * 队列的实现类：
     * 1.ArrayBlockingQueue：有序的队列，且有界，存在缓冲队列
     * 2.LinkedBlockingQueue：有序的队列，且无界(其实为int最大值)，存在缓冲队列
     * 3.SynchronousQueue：无界，且不存在缓冲的队列
     * @return
     */
    public static ThreadPoolExecutor getPool() {
        return new ThreadPoolExecutor(ThreadBody.corePoolSize,
                ThreadBody.maximumPoolSize,
                ThreadBody.keepAliveTime,
                TimeUnit.SECONDS,
                new SynchronousQueue<>());
    }
}
