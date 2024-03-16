package com.example.designMode.myThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: hongming
 * @Date: 2024/03/09/15:33
 * @Description:
 */
public class MySingleThreadExecutor {

    private static ExecutorService getSingleThreadExecutor() {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        return executorService;
    }

    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = getSingleThreadExecutor();
        for (int i = 0; i < 9; i++) {
            final Integer num = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程执行次数=" + num + "," + Thread.currentThread().getName());
                }
            };
            singleThreadExecutor.submit(runnable);
        }
    }
}
