package com.allthepreaching.api.v1.populator.impl;

import com.allthepreaching.api.v1.dto.VideoDto;
import com.allthepreaching.api.v1.model.VideoModel;
import com.allthepreaching.api.v1.populator.ModelToDtoPopulator;
import org.springframework.stereotype.Component;

@Component
public class VideoModelToVideoDtoPopulator implements ModelToDtoPopulator<VideoModel, VideoDto> {

    @Override
    public VideoDto populate(VideoModel source, VideoDto destination) {
        destination.setVideoCategory(source.getVidCategory());
        destination.setVideoName(source.getVidTitle());
        destination.setVideoUrl(source.getVidUrl());
        destination.setVideoPreacher(source.getVidPreacher());
        destination.setVideoDate(source.getDate());
        return destination;
    }
}
