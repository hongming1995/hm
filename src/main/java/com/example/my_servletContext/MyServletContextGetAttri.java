package com.example.my_servletContext;

import com.example.spring.my_webApplicationContextAware.ApplicationContextUtil;
import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/getAttri")
public class MyServletContextGetAttri {

    @RequestMapping("/getId")
    @ResponseBody
    public String getId(HttpServletRequest request) {
        String id = "";
        ServletContext servletContext = request.getSession().getServletContext();
        Object userId = servletContext.getAttribute("id");
        if (!StringUtils.isEmpty(userId)) {
            id = String.valueOf(userId);
        }
        System.out.println("获取共享参数= " + id);
        return id;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public String getValue(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        return userId;
    }
}
