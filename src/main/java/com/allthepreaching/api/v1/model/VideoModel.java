package com.allthepreaching.api.v1.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "videos")
public class VideoModel extends SimpleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "vid_category", length = 150)
    private String vidCategory;

    @Column(name = "search_category", length = 150)
    private String searchCategory;

    @Column(name = "vid_preacher", length = 150)
    private String vidPreacher;

    @Column(name = "name", length = 500)
    private String name;

    @Column(name = "vid_title", length = 500)
    private String vidTitle;

    @Column(name = "vid_code", length = 500)
    private String vidCode;

    @Column(name = "date", length = 50)
    private String date;

    @Column(name = "vid_url", length = 500)
    private String vidUrl;

    @Column(name = "thumb_url", length = 500)
    private String thumbUrl;

    @Column(name = "pic_url", length = 500)
    private String picUrl;

    @Column(name = "header_url", length = 500)
    private String headerUrl;

    @Column(name = "video_id", length = 150)
    private String videoId;

    @Column(name = "profile_id", length = 50)
    private String profileId;

    @Column(name = "main_category", length = 150)
    private String mainCategory;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "clicks")
    private int clicks;

    @Column(name = "shorts")
    private boolean shorts; // Default to false if using tinyint(1) as 0

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVidCategory() {
        return vidCategory;
    }

    public void setVidCategory(String vidCategory) {
        this.vidCategory = vidCategory;
    }

    public String getSearchCategory() {
        return searchCategory;
    }

    public void setSearchCategory(String searchCategory) {
        this.searchCategory = searchCategory;
    }

    public String getVidPreacher() {
        return vidPreacher;
    }

    public void setVidPreacher(String vidPreacher) {
        this.vidPreacher = vidPreacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVidTitle() {
        return vidTitle;
    }

    public void setVidTitle(String vidTitle) {
        this.vidTitle = vidTitle;
    }

    public String getVidCode() {
        return vidCode;
    }

    public void setVidCode(String vidCode) {
        this.vidCode = vidCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVidUrl() {
        return vidUrl;
    }

    public void setVidUrl(String vidUrl) {
        this.vidUrl = vidUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getHeaderUrl() {
        return headerUrl;
    }

    public void setHeaderUrl(String headerUrl) {
        this.headerUrl = headerUrl;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getMainCategory() {
        return mainCategory;
    }

    public void setMainCategory(String mainCategory) {
        this.mainCategory = mainCategory;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getClicks() {
        return clicks;
    }

    public void setClicks(int clicks) {
        this.clicks = clicks;
    }

    public boolean isShorts() {
        return shorts;
    }

    public void setShorts(boolean shorts) {
        this.shorts = shorts;
    }
}
