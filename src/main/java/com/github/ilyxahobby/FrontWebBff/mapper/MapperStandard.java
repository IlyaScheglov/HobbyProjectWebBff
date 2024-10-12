package com.github.ilyxahobby.FrontWebBff.mapper;

public interface MapperStandard<FD, SD> {

    FD mapToFirstsDto(SD secondDto);

    SD mapToSecondDto(FD firstDto);
}
