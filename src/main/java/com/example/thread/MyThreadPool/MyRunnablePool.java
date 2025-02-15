package com.example.thread.MyThreadPool;

/**
 * @Author: hongming
 * @Date: 2025/02/11/22:31
 * @Description:
 */
public class MyRunnablePool implements Runnable{
    @Override
    public void run() {
        System.out.println("执行线程：" + Thread.currentThread());
    }
}
