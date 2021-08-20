package com.example.designMode.MyThreadPoolExecutor;

import org.springframework.stereotype.Service;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class MyExecutor implements Executor {


    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
        //runnable.run();
    }
}
