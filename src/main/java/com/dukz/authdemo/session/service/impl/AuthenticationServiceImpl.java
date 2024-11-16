package com.dukz.authdemo.session.service.impl;

import com.dukz.authdemo.session.model.AuthenticationRequest;
import com.dukz.authdemo.session.model.UserDto;
import com.dukz.authdemo.session.service.AuthenticationService;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private Map<String, UserDto> userMap = new HashMap<>(2);
    {
        Set<String> authorities1 = new HashSet<>();
        authorities1.add("p1");
        Set<String> authorities2 = new HashSet<>();
        authorities2.add("p2");
        userMap.put("zhangsan", new UserDto(1001, "zhangsan", "123456", "张三", "13777777777", authorities1));
        userMap.put("lisi", new UserDto(1002, "lisi", "123456", "李四", "13777777777", authorities2));
    }
    @Override
    public UserDto authentication(AuthenticationRequest authenticationRequest) {
        // user authentication
        if(Objects.isNull(authenticationRequest) ||
            StringUtils.isEmpty(authenticationRequest.getUsername()) ||
            StringUtils.isEmpty(authenticationRequest.getPassword())){
            throw new RuntimeException("username or password is null");
        }

        UserDto user = getUser(authenticationRequest.getUsername());
        if(Objects.isNull(user)){
            throw new RuntimeException("user not found!");
        }
        // check password
        if(!StringUtils.equals(authenticationRequest.getPassword(), user.getPassword())){
            throw new RuntimeException("username or password is incorrect!");
        }

        // authentication is passed
        return user;
    }

    private UserDto getUser(String username){
        return (UserDto) MapUtils.getObject(userMap, username);
    }

}
