package com.example.thread.MyThreeThread;


/**
 * @Author: hongming
 * @Date: 2025/02/11/21:50
 * @Description:
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("执行线程：" + Thread.currentThread());
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }
}
