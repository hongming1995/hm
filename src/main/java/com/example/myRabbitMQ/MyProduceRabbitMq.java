package com.example.myRabbitMQ;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeoutException;

/**
 * @Author: hongming
 * @Date: 2024/03/26/23:15
 * @Description: 消息生产者
 */
public class MyProduceRabbitMq {
    
    /**
     * @description 生产者发送的消息内容
     * @param message
    **/
    public void setMessage(String message) throws IOException, TimeoutException {
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
        /* 通过信道创建交换器：Exchange
        * 参数1：交换器名称
        * 参数2：交换器类型：direct、fanout、topic、headers
        * 参数3：是否持久化
        * 参数4：交换器没有队列时是否删除，false不删除
        * 参数5：Map<String,Object>类型，用来指定我们交换机其它的一些结构化参数
        * */
        String exchangeName = "myExchange";
        BuiltinExchangeType exchangeType = BuiltinExchangeType.DIRECT;
        channel.exchangeDeclare(exchangeName, exchangeType, true, false, null);
        /*通过信道创建队列
        * 参数1：队列名称
        * 参数2：是否持久化
        * 参数3：是否私有，只有创建它的才能消费
        * 参数4：没有消费者消费队列是否删除
        * 参数5：队列的一些结构化信息，比如声明死信队列，磁盘队列会用到
         * */
        String queueName = "myQueue";
        channel.queueDeclare(queueName, true, false, false, null);
        /*将交换机和队列绑定
        *参数1：队列名称
        *参数2：交换器名称
        *参数3：路由键，直连情况下，可以直接使用队列名称
        * */
        channel.queueBind(queueName, exchangeName, "myRouting");
        /*发送消息
        * 参数1：交换器名称
        * 参数2：队列名称
        * 参数3：其他参数
        * 参数4：发送消息的消息体：byte[]，使用流的方法传输
        * */
        channel.basicPublish(exchangeName, queueName, null, message.getBytes(StandardCharsets.UTF_8));
        // 关闭信道、关闭连接
        channel.close();
        connection.close();
    }
}
