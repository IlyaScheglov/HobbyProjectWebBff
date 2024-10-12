package com.github.ilyxahobby.FrontWebBff.dto.myimages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
@AllArgsConstructor
public class MyImagesResponse {

    List<ImageDto> images;

    Integer countImages;
}
