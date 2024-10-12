package com.github.ilyxahobby.FrontWebBff.controller.v1;

import com.github.ilyxahobby.FrontWebBff.dto.HelloWorldDto;
import com.github.ilyxahobby.FrontWebBff.service.ImagesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web-bff/api/v1")
@RequiredArgsConstructor
public class HelloWorldController {

    private final ImagesService imagesService;

    @GetMapping("/get-hello-message")
    public ResponseEntity<HelloWorldDto> helloWorld() {
        return ResponseEntity.ok(HelloWorldDto.builder()
                .message(imagesService.test(1))
                .build());
    }
}
