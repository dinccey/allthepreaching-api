package com.allthepreaching.api.v1.service;

import com.allthepreaching.api.v1.dto.CategoryDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    Page<CategoryDto> getCategories(Pageable pageable);
}
