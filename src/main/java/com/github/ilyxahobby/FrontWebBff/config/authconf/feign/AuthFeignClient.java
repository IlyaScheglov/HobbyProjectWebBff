package com.github.ilyxahobby.FrontWebBff.config.authconf.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.UUID;

@FeignClient(
        name="auth-client",
        url="${auth-service.url}",
        configuration = AuthFeignConfig.class
)
public interface AuthFeignClient {

    @GetMapping
    UUID tryDoRequest(@RequestHeader String jwtToken);
}
