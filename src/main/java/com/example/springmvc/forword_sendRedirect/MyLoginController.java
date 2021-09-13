package com.example.springmvc.forword_sendRedirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@Controller
@RequestMapping("login")
public class MyLoginController {

    /**
    * @Author: hm
    * @Date: 2021/9/13
    * @Description: 测试重定向
    */
    @RequestMapping("/myForword")
    public String myForword(HttpServletRequest request) {
        System.out.println("测试重定向开始");
        return "forward:/login.jsp";
    }

    /**
    * @Author: hm
    * @Param:
    * @Date: 2021/9/13
    * @return:
    * @Description: 测试转发
    */
    @RequestMapping("/mySendRedirect")
    public String mySendRedirect() {
        System.out.println("转发开始");
        return "redirect:/login.jsp";
    }
}
