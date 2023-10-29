package com.tr.Service;

import com.tr.exception.BusinessException;
import com.tr.model.JpaUserInfo;
import com.tr.repository.UserInfoRepository;
import com.tr.vm.SignUpVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.Optional;
import static com.tr.exception.TRError.*;

@Service
public class TRServiceImpl implements TRService{
    @Autowired
    UserInfoRepository userInfoRepository;

    @Override
    public Long signup(SignUpVM signUpVM) {
        validateNewUser(signUpVM);
        JpaUserInfo jpaUserInfo = new JpaUserInfo();
        jpaUserInfo.setUsername(signUpVM.getUsername());
        jpaUserInfo.setEmail(signUpVM.getEmail());
        jpaUserInfo.setPassword(getEncryptedPassword(signUpVM.getPassword()));
        jpaUserInfo.setRole("ROLE_USER_2");
        jpaUserInfo.setCreatedBy(0L);
        jpaUserInfo.setCreatedOn(LocalDateTime.now());
        JpaUserInfo user = this.userInfoRepository.save(jpaUserInfo);
        return user.getId();
    }
    private void validateNewUser(SignUpVM signUpVM){
        //Validate VM is valid and
        if(signUpVM.getUsername() == null || signUpVM.getPassword() == null || signUpVM.getEmail() == null){
            throw new BusinessException(GENERAL_ERROR);
        }
        if(signUpVM.getUsername() != null){
            Optional<JpaUserInfo> byUsername = this.userInfoRepository.findByUsername(signUpVM.getUsername());
            if(byUsername.isPresent()){
                throw new BusinessException(USERNAME_ALREADY_EXISTS);
            }
        }
        if(signUpVM.getEmail() != null){
            Optional<JpaUserInfo> byEmail = this.userInfoRepository.findByEmail(signUpVM.getEmail());
            if(byEmail.isPresent()){
                throw new BusinessException(EMAIL_ALREADY_EXISTS);
            }
        }
    }

    private String getEncryptedPassword(String password){
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        return b.encode(password);
    }
}
