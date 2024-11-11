/* Copyright (c) 2024, TD SYNNEX Corporation. All rights reserved */

package com.dukz.authdemo.session.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * application config
 * same as applicationContext_bak.xml
 *
 * @author Arvin Du
 * @version 1.0
 * @date 2024/11/11
 */
@Configuration
@ComponentScan(basePackages = "com.dukz.authdemo.session",
                excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
public class ApplicationConfig {
    // config jdbc,transaction,biz bean ...

}
