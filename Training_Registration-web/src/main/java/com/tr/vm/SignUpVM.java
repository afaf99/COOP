package com.tr.vm;

import com.tr.validator.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SignUpVM implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @NotNull
    @NotBlank
    private String username;
    @NotNull
    @NotBlank
    private String password;
    @NotNull
    @NotBlank
    private String email;

}
