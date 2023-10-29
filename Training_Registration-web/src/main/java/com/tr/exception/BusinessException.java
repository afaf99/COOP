package com.tr.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString(doNotUseGetters = true)
public class BusinessException extends RuntimeException{

    public ApiErrorResponse apiErrorResponse;
    public String message;

    public <T extends TRError> BusinessException(T errorDetails){
        this.apiErrorResponse = new ApiErrorResponse(errorDetails.getCode(), errorDetails.getMessage());
    }
}
