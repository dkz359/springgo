package com.dukz.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 提供能力的config
 *
 * @ClassName RootConfig
 * @Author dukz
 * @Date 2021/11/9
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.dukz"},
               excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION, value = EnableWebMvc.class)})
public class RootConfig {
}
