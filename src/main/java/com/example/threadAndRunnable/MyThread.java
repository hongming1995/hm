package com.example.threadAndRunnable;

/**
 * @Author: hongming
 * @Date: 2024/03/06/21:55
 * @Description:
 */
public class MyThread extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(1000);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
