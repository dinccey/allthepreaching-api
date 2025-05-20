package com.allthepreaching.api.v1.controller;

import com.allthepreaching.api.v1.dto.VideoDto;
import com.allthepreaching.api.v1.service.VideoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/{preacher}")
    public Page<VideoDto> getAllVideosByPreacher(@PathParam(value = "preacher") String preacher, @RequestParam(name = "numResults", defaultValue = "20") int numResults, @RequestParam(name = "page", defaultValue = "0") int page) {

        return videoService.getAllVideosByPreacher(preacher, PageRequest.of(page, numResults));
    }
}
