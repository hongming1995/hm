package com.example.javabase.thread.poolHandler.MyRejectedExecutionHandler;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @Author: hongming
 * @Date: 2025/02/13/20:58
 * @Description: 自定义拒绝策略
 */
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("任务被拒绝" + r.toString());
        // 判断当前线程池是否关闭
        if (!executor.isShutdown()) {
            try {
                executor.getQueue().put(r);
            } catch (InterruptedException e) {
                // 线程关闭
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
}
