package com.allthepreaching.api.v1.populator;

import com.allthepreaching.api.v1.dto.SimpleDto;
import com.allthepreaching.api.v1.model.SimpleModel;
import org.springframework.stereotype.Component;

@Component
public interface ModelToDtoPopulator<T extends SimpleModel, R extends SimpleDto> {
    R populate(T source, R destination);
}
