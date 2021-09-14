package com.example.demo;

import com.example.spring.my_xml_application.MyClassPathApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author: hongming
 * @Date: 2021/09/14/11:50
 * @Description: 测试注解注入spring容器
 */

@SpringBootTest
public class MyClassPathApplicationTest {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classPathApplication.xml");
        MyClassPathApplication myClassPathApplication = context.getBean(MyClassPathApplication.class);
        myClassPathApplication.testClassPath();
    }
}
