package com.magict.magic.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author ZP
 * @date 2018/5/1020:25
 * @description:
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter{

    /**
     * 配置登录页面和404页面
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/unauthorize").setViewName("404");
    }

    /**
     * 注册拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加自己的拦截器
        super.addInterceptors(registry);
    }
}
