/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daw.clubspringboot;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author jrbalsas
 */
@Configuration
public class ClubSpringMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        //Enable direct access to Web Pages resources
        configurer.enable();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //Define routes to simple views
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/").setViewName("forward:/index.jsp");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);

    }

}
