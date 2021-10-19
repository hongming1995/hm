package com.example.spring_mvc.test_HandlerInterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: hongming
 * @Date: 2021/10/13/22:52
 * @Description:
 */
@Controller
@RequestMapping("/myHandler")
public class MyHandlerController {

    @RequestMapping("/handlerValue")
    @ResponseBody
    public String getValue(HttpServletRequest request) {
        return request.getParameter("name");
    }
}
