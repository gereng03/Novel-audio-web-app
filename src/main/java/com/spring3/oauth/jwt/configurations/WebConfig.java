//package com.spring3.oauth.jwt.configurations;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//            .allowedOriginPatterns("http://localhost:3388")
//            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//            .allowCredentials(true);
//    }
//}