package com.zsl.springboot.bootdemo.controller;

import com.zsl.springboot.bootdemo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BaseController {
    //slf4j是日志一种接口
    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String hello(){
        logger.info("hello:{}","张三");
        return "hello1";
    }

    @RequestMapping("/login")
    public String login(String username,String passwd) {
        boolean login = userService.login(username, passwd);
        if(login) {
            return "登陆成功";
        }else {
            return  "登陆失败";
        }
    }

    @RequestMapping("/register")
    public String register(String username,String passwd) {
        boolean login = userService.register(username, passwd);
        if(login) {
            return "注册成功";
        }else {
            return  "注册失败";
        }
    }

    @RequestMapping("/batchAdd")
    public String batchAdd(String username,String passwd) {
        userService.batchAdd(username, passwd);
        return "成功";
    }
}
