package com.example.demo;

import com.example.spring.create_proxy.MakeUserProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: hongming
 * @Date: 2021/09/15/18:50
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserProxyTest {
    @Autowired
    private MakeUserProxy makeUserProxy;

    @Test
    public void test() {
        makeUserProxy.testProxy();
    }
}
