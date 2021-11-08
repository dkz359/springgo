package com.dukz.config;

import com.dukz.aspect.HelloCounter;
import com.dukz.controller.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * spring配置类
 *
 * @ClassName AppConfig
 * @Author dukz
 * @Date 2021/11/8
 * @Version 1.0
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AppConfig {

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public HelloCounter helloCounter(){
        return new HelloCounter();
    }
}
