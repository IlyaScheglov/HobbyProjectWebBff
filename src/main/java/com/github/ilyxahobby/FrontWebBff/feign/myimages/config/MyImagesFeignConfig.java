package com.github.ilyxahobby.FrontWebBff.feign.myimages.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;

public class MyImagesFeignConfig {

    @Bean
    public Feign.Builder feignBuilder() {
        return Feign.builder();
    }
}
