package com.example.demo;

import com.example.designMode.proxy.MyProxy;
import com.example.designMode.proxy.ProxyTestService;
import com.example.designMode.proxy.impl.ProxyTestServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.proxy.Proxy;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class proxyTest {

    @Test
    public void proxy() {
        MyProxy myProxy = new MyProxy(new ProxyTestServiceImpl());
        ProxyTestService proxyTestService = (ProxyTestService) Proxy.newProxyInstance(proxyTest.class.getClassLoader(), new Class[]{ProxyTestService.class}, myProxy);
        proxyTestService.proxyTest("jdk:");
    }
}
