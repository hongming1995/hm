package com.example.demo.spring;

import com.example.my_batis.model.User;
import com.example.my_batis.service.UserMyBatisService;
import com.example.my_batis.util.DateToStringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.UUID;

/**
 * @Author: hongming
 * @Date: 2021/09/18/1:44
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyBatisUserTest {

    @Autowired
    private UserMyBatisService userMyBatisService;

    @Test
    public void test() {
        User user = new User();
        user.setPkId(UUID.randomUUID().toString());
        user.setUserId(DateToStringUtil.getDateString(new Date()));
        user.setUserName("张三");
        user.setSex("男");
        Integer count = userMyBatisService.insert(user);
        System.out.println("操作" + (count > 0 ? "成功" : "失败"));
    }
}
