/* Copyright (c) 2024, TD SYNNEX Corporation. All rights reserved */

package com.dukz.authdemo.springsecurity.init;

import com.dukz.authdemo.springsecurity.config.ApplicationConfig;
import com.dukz.authdemo.springsecurity.config.WebConfig;
import com.dukz.authdemo.springsecurity.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * spring application initializer
 * same as web.xml
 *
 * @author Arvin Du
 * @version 1.0
 * @date 2024/11/11
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * spring container
     * applicationContext.cml
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    /**
     * servlet context
     * springmvc.xml
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * url mapping
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}