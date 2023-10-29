package com.tr.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TRError {

    GENERAL_ERROR(1000, "A general error has occurred."),
    USERNAME_ALREADY_EXISTS(1001, "Username already exists"),
    EMAIL_ALREADY_EXISTS(1002, "Email already exists")
    ;

    private int code;
    private String message;
}
