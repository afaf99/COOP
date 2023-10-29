package com.tr.repository;

import com.tr.model.JpaUserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserInfoRepository extends JpaRepository<JpaUserInfo, Long> {


    Optional<JpaUserInfo> findByEmail(String email);

    Optional<JpaUserInfo> findByUsername(String username);
}
