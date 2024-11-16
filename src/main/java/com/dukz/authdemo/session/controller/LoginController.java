package com.dukz.authdemo.session.controller;

import com.dukz.authdemo.session.model.AuthenticationRequest;
import com.dukz.authdemo.session.model.UserDto;
import com.dukz.authdemo.session.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Objects;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(value = "/login", produces = "text/plain;charset=utf-8")
    public String authentication(AuthenticationRequest authenticationRequest, HttpSession session){
        UserDto userDto = authenticationService.authentication(authenticationRequest);
        // set session
        session.setAttribute(UserDto.USER_SESSION_KEY, userDto);
        return userDto.getFullname() + " login success";
    }

    @GetMapping(value = "/logout", produces = "text/plain;charset=utf-8")
    public String logout(HttpSession session){
        session.invalidate();
        return "logout success";
    }
    @GetMapping(value = "/r/r1", produces = "text/plain;charset=utf-8")
    public String readResource1(HttpSession session){
        String fullname = "";
        Object obj = session.getAttribute(UserDto.USER_SESSION_KEY);
        if(Objects.isNull(obj)){
            fullname = "匿名";
        }else {
            UserDto user = (UserDto) obj;
            fullname = user.getFullname();
        }
        return fullname + "访问资源r1";
    }
    @GetMapping(value = "/r/r2", produces = "text/plain;charset=utf-8")
    public String readResource2(HttpSession session){
        String fullname = "";
        Object obj = session.getAttribute(UserDto.USER_SESSION_KEY);
        if(Objects.isNull(obj)){
            fullname = "匿名";
        }else {
            UserDto user = (UserDto) obj;
            fullname = user.getFullname();
        }
        return fullname + "访问资源r2";
    }


}
