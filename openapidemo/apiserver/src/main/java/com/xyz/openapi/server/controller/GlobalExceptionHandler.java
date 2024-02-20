package com.xyz.openapi.server.controller;

import com.xyz.openapi.server.model.ErrorResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ErrorResponse> handleReaderException(Exception exception) {
        LOGGER.error("Handling Generic Exception", exception);
        return ResponseEntity.status(INTERNAL_SERVER_ERROR)
                .body(new ErrorResponse().setErrorMsg(exception.getMessage()));
    }
}
