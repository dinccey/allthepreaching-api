package com.allthepreaching.api.v1.dto;

public class VideoDto extends SimpleDto {
    private String videoName;
    private String videoPreacher;
    private String videoCategory;
    private String videoUrl;
    private String subtitleUrl;
    private String videoDate;

    public String getVideoDate() {
        return videoDate;
    }

    public void setVideoDate(String videoDate) {
        this.videoDate = videoDate;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public String getVideoPreacher() {
        return videoPreacher;
    }

    public void setVideoPreacher(String videoPreacher) {
        this.videoPreacher = videoPreacher;
    }

    public String getVideoCategory() {
        return videoCategory;
    }

    public void setVideoCategory(String videoCategory) {
        this.videoCategory = videoCategory;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getSubtitleUrl() {
        return subtitleUrl;
    }

    public void setSubtitleUrl(String subtitleUrl) {
        this.subtitleUrl = subtitleUrl;
    }
}
