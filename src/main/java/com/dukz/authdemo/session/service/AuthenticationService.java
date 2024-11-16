package com.dukz.authdemo.session.service;

import com.dukz.authdemo.session.model.AuthenticationRequest;
import com.dukz.authdemo.session.model.UserDto;

public interface AuthenticationService {

    UserDto authentication(AuthenticationRequest authenticationRequest);
}
