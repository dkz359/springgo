package com.dukz.authdemo.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login-success", produces = {"text/plain;charset=utf-8"})
    public String loginSuccess(){
        return "登录成功";
    }

    @GetMapping(value = "/r/r1", produces = "text/plain;charset=utf-8")
    public String readResource1(){
        return "访问资源r1";
    }
    @GetMapping(value = "/r/r2", produces = "text/plain;charset=utf-8")
    public String readResource2(){
        return "访问资源r2";
    }
}
