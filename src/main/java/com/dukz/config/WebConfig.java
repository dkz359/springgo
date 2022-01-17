package com.dukz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * web相关配置
 *
 * @ClassName WebConfig
 * @Author dukz
 * @Date 2021/11/9
 * @Version 1.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.dukz.web")
public class WebConfig extends WebMvcConfigurerAdapter {

    /**
     * 配置视图解析器
     * @Author dukz
     * @Date 2021/11/9
     * @Param
     * @return
     **/
    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    }


    /**
     * 静态资源的处理
     * @Author dukz
     * @Date 2021/11/9
     * @Param
     * @return
     */
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
