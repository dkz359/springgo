/* Copyright (c) 2024, TD SYNNEX Corporation. All rights reserved */

package com.dukz.authdemo.session.config;

import com.dukz.authdemo.session.interceptor.SimpleAuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * web config
 * same as springmvc.xml
 *
 * @author Arvin Du
 * @version 1.0
 * @date 2024/11/11
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.dukz.authdemo.session",
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class WebConfig implements WebMvcConfigurer {
    @Autowired
    private SimpleAuthInterceptor simpleAuthInterceptor;

    // config web bean
    // config view resolver
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        // WebMvcConfigurer.super.addViewControllers(registry);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(simpleAuthInterceptor).addPathPatterns("/r/**");
    }
}
