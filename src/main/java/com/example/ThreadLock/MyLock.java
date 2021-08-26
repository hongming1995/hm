package com.example.ThreadLock;

import org.springframework.stereotype.Service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class MyLock {
    private int data = 15;

    private Lock lock = new ReentrantLock();

    public void setData(int i) {
        try {
            lock.lock();
            System.out.println("===票当前存在" + data + "张===");
            if (data <= 0) {
                System.out.println(Thread.currentThread().getName() + "票以销售结束");
                return;
            }
            data = data - i;
            System.out.println(Thread.currentThread().getName() + "线程将值修改为" + data);
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public Integer getData() {
        return data;
    }
}
