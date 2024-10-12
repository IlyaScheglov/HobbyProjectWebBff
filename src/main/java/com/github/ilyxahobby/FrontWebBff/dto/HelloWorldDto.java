package com.github.ilyxahobby.FrontWebBff.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class HelloWorldDto {

    String message;
}
