package com.tr.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "user_info", schema = "TRANS")
public class JpaUserInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 2814405321465968794L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "username")
    private String username;

    @Column(columnDefinition = "email")
    private String email;

    @Column(columnDefinition = "password")
    private String password;

    @Column(columnDefinition = "role")
    private String role;

    @Column(columnDefinition = "update_on")
    private LocalDateTime updateOn;

    @CreatedDate
    @Column(columnDefinition = "created_on", nullable = false)
    private LocalDateTime createdOn;

    @Column(columnDefinition = "created_by", length = 100, nullable = false)
    private Long createdBy;

    @Column(columnDefinition = "updated_by", length = 100)
    private Long updatedBy;
}
