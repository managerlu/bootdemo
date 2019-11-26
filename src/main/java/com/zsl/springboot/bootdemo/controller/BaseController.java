package com.zsl.springboot.bootdemo.controller;

import com.zsl.springboot.bootdemo.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Api(tags = "用户管理")
public class BaseController {
    //slf4j是日志一种接口
    private Logger logger = LoggerFactory.getLogger(BaseController.class);

    @Autowired
    private IUserService userService;

    @RequestMapping("/hello")
    public String hello(){
        logger.debug("hello:{}","张三");
        return "hello3";
    }

    @RequestMapping("/login")
    @ApiOperation(value = "用户登录",notes = "用户登录")
    public String login(@ApiParam(name = "username",value = "用户名") String username,@ApiParam(name = "passwd",value = "密码") String passwd) {
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
