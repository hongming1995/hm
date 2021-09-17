package com.example.my_batis;


import com.example.my_batis.model.User;
import org.springframework.stereotype.Repository;

/**
 * @Author: hongming
 * @Date: 2021/09/17/18:56
 * @Description: 测试连接mybatis
 */
@Repository
public interface UserMapper {

    Integer insert(User user);
}
