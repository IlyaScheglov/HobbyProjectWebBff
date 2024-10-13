package com.github.ilyxahobby.FrontWebBff.dto.auth;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class LoginUserRequestDto {

    String login;

    String password;
}
