package com.example.ThreadLock;

import org.springframework.stereotype.Service;

@Service
public class MySynchronized{
    private int data = 10;

    /**
     * 加入synchronized锁，到方法结束才会自动释放锁
     * @param i
     */
    public synchronized void setData(int i){
        System.out.println("===票当前存在" + data + "张===");
        if (data <= 0) {
            System.out.println(Thread.currentThread().getName() + "票以销售结束");
            return;
        }
        data = data - i;
        System.out.println(Thread.currentThread().getName() + "线程将值修改为" + data);
    }

    public Integer getData() {
        return data;
    }
}
