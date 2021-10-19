package com.example.spring_mvc.test_HandlerInterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: hongming
 * @Date: 2021/10/13/22:54
 * @Description:
 */
@Controller
@RequestMapping("/userHandler")
public class UserHandlerController {

    @RequestMapping("/userValue")
    @ResponseBody
    public String userValue(HttpServletRequest request) {
        return request.getParameter("name");
    }
}
