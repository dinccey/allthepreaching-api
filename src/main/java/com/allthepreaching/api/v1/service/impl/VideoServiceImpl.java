package com.allthepreaching.api.v1.service.impl;

import com.allthepreaching.api.v1.dto.VideoDto;
import com.allthepreaching.api.v1.model.VideoModel;
import com.allthepreaching.api.v1.populator.ModelToDtoPopulator;
import com.allthepreaching.api.v1.repository.VideoRepository;
import com.allthepreaching.api.v1.service.VideoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements VideoService {

    private final VideoRepository videoRepository;
    private final ModelToDtoPopulator<VideoModel, VideoDto> modelToDtoPopulator;

    public VideoServiceImpl(VideoRepository videoRepository, ModelToDtoPopulator<VideoModel, VideoDto> modelToDtoPopulator) {
        this.videoRepository = videoRepository;
        this.modelToDtoPopulator = modelToDtoPopulator;
    }

    @Override
    public Page<VideoDto> getAllVideos(Pageable pageable) {
        Page<VideoModel> videoModels = videoRepository.findAllOrderByDateDesc(pageable);
        return videoModels.map(videoModel -> modelToDtoPopulator.populate(videoModel, new VideoDto()));
    }

    @Override
    public Page<VideoDto> getAllVideosByPreacher(String vidCategory, Pageable pageable) {
        Page<VideoModel> videoModels = videoRepository.findAllByVidCategoryContainingOrderByDateDesc(vidCategory, pageable);
        return videoModels.map(videoModel -> modelToDtoPopulator.populate(videoModel, new VideoDto()));
    }
}
