package com.github.ilyxahobby.FrontWebBff.feign.auth.client;

import com.github.ilyxahobby.FrontWebBff.dto.auth.LoginUserRequestDto;
import com.github.ilyxahobby.FrontWebBff.dto.auth.RegisterNewUserRequestDto;
import com.github.ilyxahobby.FrontWebBff.feign.auth.config.AuthLogRegFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name="auth-service-login-registration",
        url="${auth-service.url}",
        configuration = AuthLogRegFeignConfig.class
)
public interface AuthLogRegFeignClient {

    @PostMapping("/auth-service/api/v1/registration")
    String registerNewUser(@RequestBody RegisterNewUserRequestDto registrationUserDto);

    @PostMapping("/auth-service/api/v1/login")
    String loginUser(@RequestBody LoginUserRequestDto loginUserDto);
}
