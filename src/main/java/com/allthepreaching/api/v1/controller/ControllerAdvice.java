package com.allthepreaching.api.v1.controller;

import com.allthepreaching.api.v1.exception.AllthepreachingApiException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler({AllthepreachingApiException.class})
    public ResponseEntity<Void> handleSubtitleFtsException(AllthepreachingApiException ex, WebRequest request){

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
