package com.example.designMode.testThreadLocal;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MyThread {

    public void getThread(List<String> list) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> data = new ArrayList<>();
                ThreadLocal<List<String>> threadLocal = MyThreadLocal.getData();
                for (String num : list) {
                    if (!(threadLocal.get().contains(num))) {
                        threadLocal.get().add(num);
                        data.add(num);
                    }
                }
                System.out.println(data.toString());
            }
        });
        thread.start();
    }

    public void getNoLocal(Map<String, Object> map, int i) {
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                if (i == 0) {
                    map.put("one", "10");
                }
                System.out.println(map.toString());
            }
        });
        thread.start();
    }

    public void getHaveLocal(String num,int i) {
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                MyThreadLocal.setMapValue(num);
                if (i == 0) {
                    MyThreadLocal.setMapValue("10");
                }
                System.out.println(MyThreadLocal.getMapValue());
            }
        });
        thread.start();
    }



}
