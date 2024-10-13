package com.github.ilyxahobby.FrontWebBff.dto.auth;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class RegisterNewUserRequestDto {

    String login;

    String password;

    UUID secretInviteKey;
}
