package com.allthepreaching.api.v1.controller;

import com.allthepreaching.api.v1.dto.VideoDto;
import com.allthepreaching.api.v1.service.VideoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/videos")
public class VideosController {


    private final VideoService videoService;

    public VideosController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/all")
    public Page<VideoDto> getAllVideos(@RequestParam(name = "numResults", defaultValue = "20") int numResults, @RequestParam(name = "page", defaultValue = "0") int page) {

        return videoService.getAllVideos(PageRequest.of(page, numResults));
    }

    @GetMapping("/{vidCategory}")
    public Page<VideoDto> getAllVideosByPreacher(@RequestParam(name = "numResults", defaultValue = "20") int numResults, @RequestParam(name = "page", defaultValue = "0") int page, @PathVariable String vidCategory) {

        return videoService.getAllVideosByPreacher(vidCategory, PageRequest.of(page, numResults));
    }
}
