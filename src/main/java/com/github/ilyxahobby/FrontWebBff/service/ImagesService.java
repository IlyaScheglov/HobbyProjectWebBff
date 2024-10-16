package com.github.ilyxahobby.FrontWebBff.service;

import com.github.ilyxahobby.FrontWebBff.dto.myimages.ImageDto;
import com.github.ilyxahobby.FrontWebBff.feign.myimages.client.MyImagesFeignClient;
import io.github.ilyascheglov.memcached_aspect_starter.aspect.annotations.MemCacheEvict;
import io.github.ilyascheglov.memcached_aspect_starter.aspect.annotations.MemCacheable;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ImagesService {

    private final MyImagesFeignClient myImagesFeignClient;

    @MemCacheable(prefix = "Images", keyArgumentName = "userId")
    public List<ImageDto> getMyImages(UUID userId) {
        return myImagesFeignClient.getMyPhotos(userId);
    }

    @MemCacheEvict(prefix = "Images", keyArgumentName = "userId")
    public ImageDto addNewImage(String title, MultipartFile image, UUID userId) {
        return myImagesFeignClient.addNewPhoto(title, image);
    }
}
