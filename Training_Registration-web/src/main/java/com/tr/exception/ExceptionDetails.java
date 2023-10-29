package com.tr.exception;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class ExceptionDetails extends RuntimeException{
    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String errorMessage;

    public ExceptionDetails() {

    }

    public ExceptionDetails(String errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
