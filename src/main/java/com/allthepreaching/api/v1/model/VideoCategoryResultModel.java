package com.allthepreaching.api.v1.model;

public class VideoCategoryResultModel extends SimpleModel {

    public VideoCategoryResultModel(String vidCategory, String searchCategory) {
        this.vidCategory = vidCategory;
        this.searchCategory = searchCategory;
    }

    private String vidCategory;

    private String searchCategory;

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
}
