package com.github.ilyxahobby.FrontWebBff.dto.myimages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class ImageDto {

    String imageName;

    String imageUrl;
}
