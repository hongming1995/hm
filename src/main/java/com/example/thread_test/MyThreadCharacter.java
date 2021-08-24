package com.example.thread_test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class MyThreadCharacter {
    //一致性，volatile 避免执行重排
    private volatile int data;

    private volatile List<Integer> list = new ArrayList<>();

    // 非公平锁大多数还是按照阻塞队列顺序执行 true:公平锁。  false或者空：非公平
    private final Lock lock = new ReentrantLock(true);
    // JMM:内存模型，多线程中一个修改的公共值，主工作内容需要通知其他线程：可见性

    public void getData(int i) {
        String name = Thread.currentThread().getName();
        try {
            System.out.println("线程" + name + "想获取锁");

            lock.lock();
            if(i==0){
                Thread.sleep(20);
            }
            System.out.println("===线程" + name + "获取到锁");
            data = i;
            //list.add(i);
            //System.out.println( name+ "线程参数:" + data);
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            System.out.println("!!!线程" + name + "释放锁");
            lock.unlock();
        }
    }

    public Integer getValue() {
        return data;
    }

    public List<Integer> getList() {
        return list;
    }
}
