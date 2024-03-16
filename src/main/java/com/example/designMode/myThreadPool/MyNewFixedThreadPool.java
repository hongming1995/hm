package com.example.designMode.myThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: hongming
 * @Date: 2024/03/07/21:10
 * @Description:
 */
public class MyNewFixedThreadPool {

    public static ExecutorService createThreadPool() {
        // 创建指定大小的线程池，超出的线程会等待
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        return executorService;
    }

    public static void main(String[] args) {
        ExecutorService threadPool = createThreadPool();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程A被执行，线程名称" + Thread.currentThread().getName());
                    Thread.sleep(500);
                }catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("线程B被执行，线程名称" + Thread.currentThread().getName());
                    Thread.sleep(500);
                }catch (Exception e) {
                    e.printStackTrace();
                }

            }
        };

        Future<?> submit = threadPool.submit(runnable);
        System.out.println(submit);
        threadPool.execute(runnable1);
        threadPool.submit(runnable);
        threadPool.submit(runnable1);
    }
}
