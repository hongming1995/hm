package com.example.springFilter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author: hongming
 * @Date: 2024/03/17/17:58
 * @Description:
 */
@WebFilter(filterName = "myOneSpringFilter",urlPatterns = "/*")
public class MyOneSpringFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化one过滤器");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("执行One的过滤器");
        chain.doFilter(request, response);
        System.out.println("响应返回经过one过滤器");
    }

    @Override
    public void destroy() {
        System.out.println("one过滤器销毁");
    }
}
