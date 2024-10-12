package com.github.ilyxahobby.FrontWebBff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = {
		"com.github.ilyxahobby.FrontWebBff.feign",
		"com.github.ilyxahobby.FrontWebBff.config.authconf.feign"
})
@EnableConfigurationProperties
public class FrontWebBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontWebBffApplication.class, args);
	}

}
