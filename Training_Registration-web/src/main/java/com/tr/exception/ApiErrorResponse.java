package com.tr.exception;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ApiErrorResponse {

    private int code;
    private String errorDetails;

}
