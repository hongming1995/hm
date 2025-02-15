package com.example.javabase.thread.createThreadWay;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: hongming
 * @Date: 2025/02/11/22:06
 * @Description:
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String name = "我的线程：" + Thread.currentThread();
        return name;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());
        new Thread(futureTask).start();
        System.out.println(futureTask.get());
    }
}
