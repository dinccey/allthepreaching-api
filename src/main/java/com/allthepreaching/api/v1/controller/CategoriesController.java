package com.allthepreaching.api.v1.controller;

import com.allthepreaching.api.v1.dto.CategoryDto;
import com.allthepreaching.api.v1.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/categories")
public class CategoriesController {


    private final CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/all")
    public Page<CategoryDto> getAllVideos(@RequestParam(name = "numResults", defaultValue = "20") int numResults, @RequestParam(name = "page", defaultValue = "0") int page) {

        return categoryService.getCategories(PageRequest.of(page, numResults));
    }

}
