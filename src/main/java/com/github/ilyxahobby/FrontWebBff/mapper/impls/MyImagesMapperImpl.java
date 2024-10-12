package com.github.ilyxahobby.FrontWebBff.mapper.impls;

import com.github.ilyxahobby.FrontWebBff.dto.myimages.ImageDto;
import com.github.ilyxahobby.FrontWebBff.dto.myimages.MyImagesResponse;
import com.github.ilyxahobby.FrontWebBff.mapper.MapperStandard;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyImagesMapperImpl implements MapperStandard<List<ImageDto>, MyImagesResponse> {
    @Override
    public List<ImageDto> mapToFirstsDto(MyImagesResponse secondDto) {
        return null;
    }

    @Override
    public MyImagesResponse mapToSecondDto(List<ImageDto> firstDto) {
        return MyImagesResponse.builder()
                .images(firstDto)
                .countImages(firstDto.size())
                .build();
    }
}
