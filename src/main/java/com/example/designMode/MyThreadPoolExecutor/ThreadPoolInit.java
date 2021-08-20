package com.example.designMode.MyThreadPoolExecutor;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程初始化
 */
@Service
public class ThreadPoolInit implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) throws Exception {
        MyThreadPool.threadMap.put("pms", MyThreadPool.getPool());
    }

    public void getInitPool(String key, ThreadBody threadBody) {
        ThreadPoolExecutor threadPoolExecutor = MyThreadPool.threadMap.get(key);
        //threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.setRejectedExecutionHandler(new MyRejectedExecutionHandler());
        //threadPoolExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy());
        threadPoolExecutor.submit(threadBody.getRunnable());
    }

}
