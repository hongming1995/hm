package com.example.thread.MyThreadPool;

import com.example.thread.simpleThread.MyWorkPoolThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @Author: hongming
 * @Date: 2025/02/12/22:36
 * @Description:
 */
public class MyWorkStealingPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newWorkStealingPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new MyWorkPoolThread(i + 1));
        }
        //关闭线程池，并等待线程池执行完成
        executorService.shutdown();

        try {
            // 主线程等待（如果主线程不等待，JVM会在非主线程结束后立即结束，控制台则输出不了打印信息）
            executorService.awaitTermination(15, TimeUnit.SECONDS);
        }catch (InterruptedException e) {
            // 线程中断
            Thread.currentThread().interrupt();
        }
    }
}
