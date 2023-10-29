package com.tr.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.tr.validator.ValidationError.REQUEST_NOT_VALID;

@RestControllerAdvice
public class CustomResponseException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    final ResponseEntity<String> handleBusinessException(BusinessException businessException, WebRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("result", null);
        map.put("errors", Arrays.asList(new ApiErrorResponse(businessException.apiErrorResponse.getCode(), businessException.apiErrorResponse.getErrorDetails())));

        return new ResponseEntity(map, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        Map<String, Object> map = new HashMap<>();
        map.put("result", null);
        map.put("errors", Arrays.asList(REQUEST_NOT_VALID));

        return new ResponseEntity(map, HttpStatus.BAD_REQUEST);
    }

}
