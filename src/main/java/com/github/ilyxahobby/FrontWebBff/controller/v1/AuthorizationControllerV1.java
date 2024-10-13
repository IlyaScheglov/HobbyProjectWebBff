package com.github.ilyxahobby.FrontWebBff.controller.v1;

import com.github.ilyxahobby.FrontWebBff.dto.auth.LoginUserRequestDto;
import com.github.ilyxahobby.FrontWebBff.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.V1_API_MAPPING + "/authorization")
public class AuthorizationControllerV1 {

    @PostMapping("login")
    public ResponseEntity<String> loginUser(@RequestBody LoginUserRequestDto loginUserRequestDto) {
        return ResponseEntity.ok("smth");
    }
}
