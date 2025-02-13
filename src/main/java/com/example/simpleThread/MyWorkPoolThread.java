package com.example.simpleThread;

/**
 * @Author: hongming
 * @Date: 2025/02/12/22:50
 * @Description:
 */
public class MyWorkPoolThread implements Runnable{
    private final int workValue;

    public MyWorkPoolThread(int workValue) {
        this.workValue = workValue;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程执行任务：" + workValue);
    }
}
