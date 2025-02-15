package com.example.thread.MyThreeThread;

/**
 * @Author: hongming
 * @Date: 2025/02/11/22:03
 * @Description:
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("我的线程：" + Thread.currentThread());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            MyRunnable myRunnable = new MyRunnable();
            Thread thread = new Thread(myRunnable);
            thread.start();
        }
    }
}
