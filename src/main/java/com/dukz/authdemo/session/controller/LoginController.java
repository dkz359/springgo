package com.dukz.authdemo.session.controller;

import com.dukz.authdemo.session.model.AuthenticationRequest;
import com.dukz.authdemo.session.model.UserDto;
import com.dukz.authdemo.session.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping(value = "/login", produces = "text/plain;charset=utf-8")
    public String authentication(AuthenticationRequest authenticationRequest){
        UserDto userDto = authenticationService.authentication(authenticationRequest);
        return userDto.getFullname() + " login success";
    }
}
