package com.example.my_application_listener.controller;

import com.example.my_application_listener.model.*;
import org.omg.CORBA.portable.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping("/getMessage")
    @ResponseBody
    public String getUser(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        MyEvent myEvent = new MyEvent(this, userId, userName);
        //applicationContext.publishEvent(myEvent);
        return myEvent.getMessage();
    }

    @RequestMapping("/getTwoMessage")
    @ResponseBody
    public String getTwoUser(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        TwoEvent twoEvent = new TwoEvent(this, userId, userName);
        applicationContext.publishEvent(twoEvent);
        return twoEvent.getMessage() == null ? "===" : twoEvent.getMessage();
    }

    @RequestMapping("/getThreeMessage")
    @ResponseBody
    public String getThree(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        ThreeEvent threeEvent = new ThreeEvent(this, userId, userName);
        applicationContext.publishEvent(threeEvent);
        return threeEvent.getMessage() == null ? "===" : threeEvent.getMessage();
    }

    @RequestMapping("/getFourMessage")
    @ResponseBody
    public String getFour(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        FourEvent fourEvent = new FourEvent(this, userId, userName);
        applicationContext.publishEvent(fourEvent);
        return fourEvent.getMessage() == null ? "===" : fourEvent.getMessage();
    }

    @RequestMapping("/getFiveMessage")
    @ResponseBody
    public String getFive(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        FiveEvent fiveEvent = new FiveEvent(this, userId, userName);
        applicationContext.publishEvent(fiveEvent);
        return fiveEvent.getMessage() == null ? "===" : fiveEvent.getMessage();
    }

    @RequestMapping("/getSixMessage")
    @ResponseBody
    public String getSix(HttpServletRequest request) {
        String userId = request.getParameter("userId");
        String userName = request.getParameter("userName");
        SixEvent sixEvent = new SixEvent(this, userId, userName);
        applicationContext.publishEvent(sixEvent);
        return sixEvent.getMessage() == null ? "===" : sixEvent.getMessage();
    }


}
