package com.tr;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EHospitals {

    HOSPITAL_X(1, "Maternity and children's Hospital"),
    HOSPITAL_Y(2, "Al-Amal mental health complex"),
    HOSPITAL_Z(3, "General Hospital")

    ;

    private int id;
    private String hospital ;
}
