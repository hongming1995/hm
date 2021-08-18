package com.example.designMode.testThreadLocal;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MyThread {
    private ThreadLocal<List<String>> threadLocal = new ThreadLocal<>();

    public MyThread() {
        threadLocal.set(new ArrayList<>());
    }

    public void getThread(List<String> list) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> data = new ArrayList<>();
                for (String num : list) {
                    if (!threadLocal.get().contains(num)) {
                        threadLocal.get().add(num);
                        data.add(num);
                    }
                }
                System.out.println(data.toString());
            }
        });
        thread.run();
    }

}
