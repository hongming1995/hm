package com.example.designMode.MyThreadPoolExecutor;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;

public class MyThreadPool {

    public static Map<String, ThreadPoolExecutor> threadMap = new HashMap<>();

    public static ThreadPoolExecutor getPool() {
        return new ThreadPoolExecutor(ThreadBody.corePoolSize,
                ThreadBody.maximumPoolSize,
                ThreadBody.keepAliveTime,
                TimeUnit.SECONDS,
                new SynchronousQueue<>());
    }
}
