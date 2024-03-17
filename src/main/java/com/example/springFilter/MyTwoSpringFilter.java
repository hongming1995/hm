package com.example.springFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: hongming
 * @Date: 2024/03/17/17:59
 * @Description:
 */
@WebFilter(filterName = "myTwoSpringFilter",urlPatterns = "/*")
public class MyTwoSpringFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化two过滤器");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行two过滤器");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("two过滤器销毁");
    }
}
