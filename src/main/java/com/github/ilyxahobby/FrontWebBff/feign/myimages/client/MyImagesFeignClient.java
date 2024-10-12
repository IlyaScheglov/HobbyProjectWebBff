package com.github.ilyxahobby.FrontWebBff.feign.myimages.client;

import com.github.ilyxahobby.FrontWebBff.dto.myimages.ImageDto;
import com.github.ilyxahobby.FrontWebBff.feign.myimages.config.MyImagesFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@FeignClient(
        name="image-service",
        url="${image-service.url}",
        configuration = MyImagesFeignConfig.class
)
public interface MyImagesFeignClient {

    @GetMapping("/api/v1/my-photos/{userId}")
    List<ImageDto> getMyPhotos(@PathVariable UUID userId);

    @PostMapping(consumes = { "multipart/form-data" })
    ImageDto addNewPhoto(@RequestParam String title, @RequestPart MultipartFile photo);
}
