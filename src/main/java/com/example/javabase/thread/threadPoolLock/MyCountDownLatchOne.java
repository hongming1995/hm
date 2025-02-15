package com.example.javabase.thread.threadPoolLock;

import com.example.javabase.thread.ThreadPoolUtils.MyThreadPoolExecutionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: hongming
 * @Date: 2025/02/15/21:36
 * @Description:防止死锁工具（线程同步器）：CountDownLatch
 * 案例一：主线程等待子线程执行完后再执行
 */
public class MyCountDownLatchOne {
    public static void main(String[] args) throws InterruptedException {
        List<String> workList = new ArrayList<>();
        workList.add("worker-thread-1");
        workList.add("worker-thread-2");
        workList.add("worker-thread-3");
        CountDownLatch count = new CountDownLatch(workList.size());
        ThreadPoolExecutor executor = MyThreadPoolExecutionUtil.getThreadPoolExecutor();
        executor.execute(new MyWorkRunnable(workList.get(0), count));
        executor.execute(new MyWorkRunnable(workList.get(1), count));
        executor.execute(new MyWorkRunnable(workList.get(2), count));
        // 等待子线程执行完成
        count.await();
        System.out.println("当前买票工作完成");
        executor.shutdown();
    }
}

class MyWorkRunnable implements Runnable {
    private String threadName;
    private CountDownLatch count;

    public MyWorkRunnable(String threadName, CountDownLatch count) {
        this.threadName = threadName;
        this.count = count;
    }

    @Override
    public void run() {
        System.out.println(threadName + "线程开始执行买票");
        try {
            Thread.sleep(1000);
            System.out.println(threadName + "线程买票完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(threadName + "线程执行买票异常");
        } finally {
            count.countDown();
        }
    }
}
