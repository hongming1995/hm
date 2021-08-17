package com.example.designMode.proxy;


import com.example.designMode.proxy.strong_method.EndMethod;
import com.example.designMode.proxy.strong_method.StartMethod;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler {

    private ProxyTestService proxyTestService;

    public MyProxy(ProxyTestService testService) {
        this.proxyTestService = testService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StartMethod.getStartMessage();
        Object invoke = method.invoke(proxyTestService, args);
        EndMethod.getEndMessage();
        return invoke;
    }
}
