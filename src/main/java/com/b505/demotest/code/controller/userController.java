package com.b505.demotest.code.controller;


import com.b505.demotest.code.entity.user;
import com.b505.demotest.code.service.impl.loginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class userController {
    @Autowired
    loginServiceImpl userServiceImpl;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("doLogin")
    public String doLogin(user user, Map<String,Object> map){
        user user1 =  userServiceImpl.getUser(user.getPassword(),user.getUsername());
        if(user1 == null){
            map.put("msg","登入失败");
        }else{
            map.put("msg","登入成功");
        }
        return "success";
    }
    @RequestMapping("/regist")
    public String regist(){
        return "regist";
    }

    @RequestMapping("doRegist")
    public String doRegist(user user, Map<String,Object> map){
        userServiceImpl.insertUser(user);
        map.put("msg","注册成功");
        return "success";
    }

}
