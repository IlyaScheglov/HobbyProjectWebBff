package com.github.ilyxahobby.FrontWebBff.controller.v1;

import com.github.ilyxahobby.FrontWebBff.config.authconf.AbstractControllerWithAuth;
import com.github.ilyxahobby.FrontWebBff.config.authconf.NeedAuth;
import com.github.ilyxahobby.FrontWebBff.dto.myimages.ImageDto;
import com.github.ilyxahobby.FrontWebBff.dto.myimages.MyImagesResponse;
import com.github.ilyxahobby.FrontWebBff.mapper.impls.MyImagesMapperImpl;
import com.github.ilyxahobby.FrontWebBff.service.ImagesService;
import com.github.ilyxahobby.FrontWebBff.util.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping(Constants.V1_API_MAPPING + "/my-images")
public class MyImagesControllerV1 extends AbstractControllerWithAuth {

    private final ImagesService imagesService;
    private final MyImagesMapperImpl myImagesMapper;

    @GetMapping
    @NeedAuth
    public ResponseEntity<MyImagesResponse> getMyImages() {
        var images = imagesService.getMyImages(getUserId());
        var imagesResponse = myImagesMapper.mapToSecondDto(images);

        return ResponseEntity.ok(imagesResponse);
    }

    @PostMapping(consumes = { "multipart/form-data" })
    @NeedAuth
    public ResponseEntity<ImageDto> addNewImage(@RequestParam String title, @RequestPart MultipartFile image) {
        return ResponseEntity.ok(imagesService.addNewImage(title, image, getUserId()));
    }
}
