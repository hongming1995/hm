package com.example.myRabbitMQ;

import com.rabbitmq.client.DeliverCallback;
import com.rabbitmq.client.Delivery;

import java.io.IOException;

/**
 * @Author: hongming
 * @Date: 2024/03/27/0:03
 * @Description:
 */
public class MyDeliverCallback implements DeliverCallback {
    @Override
    public void handle(String s, Delivery delivery) throws IOException {
        System.out.println("接收到的消息是：" + s);
    }
}
