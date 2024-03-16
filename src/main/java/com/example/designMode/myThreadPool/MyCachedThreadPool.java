package com.example.designMode.myThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: hongming
 * @Date: 2024/03/07/21:29
 * @Description:
 */
public class MyCachedThreadPool {

    public static ExecutorService getCachedThreadPool() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        return executorService;
    }

    public static void main(String[] args) {
        ExecutorService cachedThreadPool = getCachedThreadPool();
        for (int i = 0; i < 9; i++) {
            int finalI = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程被执行"+ finalI +"，执行线程名称=" + Thread.currentThread().getName());
                }
            };
            Future<?> submit = cachedThreadPool.submit(runnable);
            System.out.println(submit);
        }
    }
}
