package com.allthepreaching.api.v1.service;

import com.allthepreaching.api.v1.dto.VideoDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface VideoService {
    Page<VideoDto> getAllVideos(Pageable pageable);

    Page<VideoDto> getAllVideosByPreacher(String videoPreacher, Pageable pageable);

}
