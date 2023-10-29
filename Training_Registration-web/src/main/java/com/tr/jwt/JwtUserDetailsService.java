package com.tr.jwt;

import com.tr.model.JpaUserInfo;
import com.tr.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

  @Autowired
  UserInfoRepository userInfoRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {


    Optional<JpaUserInfo> usernameExists = this.userInfoRepository.findByUsername(username);

    if (!usernameExists.isPresent()) {
      throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
    }

    return mapJpaUserInfoToUserDetails(usernameExists.get());
  }

  private UserDetails mapJpaUserInfoToUserDetails(JpaUserInfo jpaUserInfo){
    return new JwtUserDetails(jpaUserInfo.getId(), jpaUserInfo.getUsername(), jpaUserInfo.getPassword(), jpaUserInfo.getRole());
  }

}


