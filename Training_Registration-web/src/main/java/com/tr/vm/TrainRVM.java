package com.tr.vm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TrainRVM implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    @NotNull
    @NotBlank
    private String fname;

    @NotNull
    @NotBlank
    private String uniy;

    @NotNull
    @NotBlank
    private String major;

    @NotNull
    private BigDecimal gpa;

    @NotNull
    @NotBlank
    private String phone;

    @NotNull
    @NotBlank
    private String dot;

    private Long id;
    @NotNull
    private String hospital;


}
