package com.example.myConnection;

import com.example.model.User;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

/**
 * @Author: hongming
 * @Date: 2021/09/18/16:19
 * @Description: 最原始的connection连接jdbc
 */
public class MyJdbcConnection {

    public static List<User> getSelectOne(String userId) {
        List<User> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        String url = "jdbc:mysql://localhost:3306/table?useUnicode=true&characterEncoding=utf-8";
        String id = "hm";
        String password = "123456";
        String sql = "select pk_id,user_id,user_name,sex from user where pk_id = ?";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 获取了解mysql对象
            connection = DriverManager.getConnection(url, id, password);
            // 获取预编译对象PreparedStatement
            ps = connection.prepareStatement(sql);
            // 塞入参数
            ps.setString(1, userId);
            // 执行sql语句
            resultSet = ps.executeQuery();
            // 解析返回结果
            while (resultSet.next()) {
                User user = new User();
                user.setPkId(resultSet.getString("pk_id"));
                user.setUserId(resultSet.getString("user_id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setSex(resultSet.getString("sex"));
                list.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                // 关闭资源
                resultSet.close();
                ps.close();
                connection.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<User> list = getSelectOne("643093d2-5177-446a-9545-604304935614");
        System.out.println(list.toString());

        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("执行线程");
            }
        };
    }
}
