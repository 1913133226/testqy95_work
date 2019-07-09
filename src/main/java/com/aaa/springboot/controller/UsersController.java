package com.aaa.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {

    /**
     * 测试返回Join数据
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String list(){
        System.out.println("测试join");
        return "world";
    }
}
