package com.example.spring_mvc.test_HandlerInterceptor;


import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: hongming
 * @Date: 2021/10/13/22:41
 * @Description:
 */
public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        //HttpServletRequestWrapper
        String name = request.getParameter("name");
        if ("hm".equals(name)) {
            request.setAttribute("name", "zhangsan");
        }
        return true;
    }
}
