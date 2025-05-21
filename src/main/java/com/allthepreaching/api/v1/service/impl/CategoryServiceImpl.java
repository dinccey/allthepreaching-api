package com.allthepreaching.api.v1.service.impl;

import com.allthepreaching.api.v1.dto.CategoryDto;
import com.allthepreaching.api.v1.model.VideoCategoryResultModel;
import com.allthepreaching.api.v1.populator.ModelToDtoPopulator;
import com.allthepreaching.api.v1.repository.VideoRepository;
import com.allthepreaching.api.v1.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final VideoRepository videoRepository;
    private final ModelToDtoPopulator<VideoCategoryResultModel, CategoryDto> modelToDtoPopulator;

    public CategoryServiceImpl(VideoRepository videoRepository, ModelToDtoPopulator<VideoCategoryResultModel, CategoryDto> modelToDtoPopulator) {
        this.videoRepository = videoRepository;
        this.modelToDtoPopulator = modelToDtoPopulator;
    }

    @Override
    public Page<CategoryDto> getCategories(Pageable pageable) {
        Page<VideoCategoryResultModel> videoModels = videoRepository.findAllCategories(pageable);
        return videoModels.map(videoModel -> modelToDtoPopulator.populate(videoModel, new CategoryDto()));
    }
}
