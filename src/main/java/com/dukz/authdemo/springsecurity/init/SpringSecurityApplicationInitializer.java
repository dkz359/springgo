package com.dukz.authdemo.springsecurity.init;

import com.dukz.authdemo.springsecurity.config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    public SpringSecurityApplicationInitializer(){
        // super(WebSecurityConfig.class);
    }
}
