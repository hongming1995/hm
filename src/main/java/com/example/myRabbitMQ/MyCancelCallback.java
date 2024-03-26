package com.example.myRabbitMQ;

import com.rabbitmq.client.CancelCallback;

import java.io.IOException;

/**
 * @Author: hongming
 * @Date: 2024/03/27/0:05
 * @Description:
 */
public class MyCancelCallback implements CancelCallback {
    @Override
    public void handle(String s) throws IOException {
        System.out.println("消息被中断" + s);
    }
}
