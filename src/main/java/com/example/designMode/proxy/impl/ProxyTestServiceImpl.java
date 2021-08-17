package com.example.designMode.proxy.impl;

import com.example.designMode.proxy.ProxyTestService;

public class ProxyTestServiceImpl implements ProxyTestService {
    @Override
    public void proxyTest(String message) {
        System.out.println(message + "动态代理测试");
    }
}
