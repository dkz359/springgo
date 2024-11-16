package com.dukz.authdemo.session.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    public static final String USER_SESSION_KEY = "_user";
    private Integer id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;
}
