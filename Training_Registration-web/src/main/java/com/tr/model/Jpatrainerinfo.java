package com.tr.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "trainer_info", schema = "TRANS")
public class Jpatrainerinfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "fname")
    private String fname;

//    @Column(columnDefinition = "user_id")
//    private Long user_id;

    @Column(columnDefinition = "uniy")
    private String uniy;

    @Column(columnDefinition = "major")
    private String major;

    @Column(columnDefinition = "gpa")
    private BigDecimal gpa;

    @Column(columnDefinition = "phone")
    private String phone;

    @Column(columnDefinition = "dot")
    private String dot;

    @Column(columnDefinition = "update_on")
    private LocalDateTime updateOn;

    @CreatedDate
    @Column(columnDefinition = "created_on", nullable = false)
    private LocalDateTime createdOn;

    @Column(columnDefinition = "created_by", length = 100, nullable = false)
    private Long createdBy;

    @Column(columnDefinition = "updated_by", length = 100)
    private Long updatedBy;

    @JoinColumn(name="hospital_department_id", referencedColumnName="id")
    @OneToOne
    private JpaHospitals hospital;

}
