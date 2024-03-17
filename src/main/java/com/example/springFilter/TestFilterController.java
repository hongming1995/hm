package com.example.springFilter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: hongming
 * @Date: 2024/03/17/18:03
 * @Description:
 */
@Controller
@RequestMapping("/test")
public class TestFilterController {

    @RequestMapping("/filter")
    @ResponseBody
    public String testFilter() {
        System.out.println("执行testFilter方法");
        return "hm";
    }
}
