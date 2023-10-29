package com.tr.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

    @Setter
    @Getter
    @Entity
    @Table(name = "hospitals", schema = "REFRENC")
    public class JpaHospitals implements Serializable {

        //@Enumerated(EnumType.STRING)
        //private EHospitals eHospitals;

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(columnDefinition = "hospital")
        private String hospital ;
    }
