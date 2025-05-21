package com.allthepreaching.api.v1.populator.impl;

import com.allthepreaching.api.v1.dto.CategoryDto;
import com.allthepreaching.api.v1.model.VideoCategoryResultModel;
import com.allthepreaching.api.v1.populator.ModelToDtoPopulator;
import org.springframework.stereotype.Component;

@Component
public class VideoModelToCategoryDtoPopulator implements ModelToDtoPopulator<VideoCategoryResultModel, CategoryDto> {

    @Override
    public CategoryDto populate(VideoCategoryResultModel source, CategoryDto destination) {
        destination.setCategoryCode(source.getVidCategory());
        destination.setCategoryName(source.getSearchCategory());
        return destination;
    }
}
