package com.example.javabase.thread.poolHandler.MyRejectedExecutionHandler;

import com.example.javabase.thread.threadBean.MyWorkPoolThread;

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

        //关闭线程池，并等待线程池执行完成
        thread.shutdown();

        try {
            // 主线程等待（如果主线程不等待，JVM会在非主线程结束后立即结束，控制台则输出不了打印信息）
            thread.awaitTermination(15, TimeUnit.SECONDS);
        }catch (InterruptedException e) {
            // 线程中断
            Thread.currentThread().interrupt();
        }
    }
}
