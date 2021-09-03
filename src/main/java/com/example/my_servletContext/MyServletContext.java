package com.example.my_servletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/myServlet")
public class MyServletContext {

    @RequestMapping("/context")
    @ResponseBody
    public void setContext(HttpServletRequest request) {
        // 获取每个服务的servletContext对象
        ServletContext servletContext = request.getSession().getServletContext();
        String userId = request.getParameter("userId");
        servletContext.setAttribute("id", userId);
    }
}
