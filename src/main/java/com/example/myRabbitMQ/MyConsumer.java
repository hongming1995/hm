package com.example.myRabbitMQ;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author: hongming
 * @Date: 2024/03/26/23:53
 * @Description: 消息消费者
 */
public class MyConsumer {

    public void getMessage() throws IOException, TimeoutException {
        // 创建连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        // id地址
        factory.setHost("localhost");
        // 用户名
        factory.setUsername("admin");
        // 密码
        factory.setPassword("123456");
        // 端口号
        factory.setPort(5672);
        // 从工厂中创建连接
        Connection connection = factory.newConnection();
        // 创建信道
        Channel channel = connection.createChannel();
        // 接收消息回调函数
        DeliverCallback deliverCallback = new MyDeliverCallback();
        //消息中断回调函数
        CancelCallback cancelCallback = new MyCancelCallback();

        /* 消费者获取消息
         * 参数1：队列名称
         * 参数2：消费成功后是否自动应答，true为自动应答
         * 参数3：接收消息的回调函数
         * 参数4：消息中断回调函数
        * */
        channel.basicConsume("myQueue", true, deliverCallback, cancelCallback);
        // 关闭通道、关闭连接
        channel.close();
        connection.close();
    }
}
