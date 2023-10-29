package com.tr.Service;

import com.tr.exception.BusinessException;
import com.tr.exception.TRError;
import com.tr.model.JpaHospitals;
import com.tr.model.Jpatrainerinfo;
import com.tr.repository.trainerInfoRepository;
import com.tr.vm.TrainRVM;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class TrainerServiceImpl implements TrainerService{

    @Autowired
    trainerInfoRepository TrainerInfoRepository;
    @Autowired
    private com.tr.repository.HospitalRepository HospitalRepository;


    @Override
    public Long trainer(TrainRVM trainRVM) {
        hospitals(trainRVM);
        Jpatrainerinfo jpatrainerinfo = new Jpatrainerinfo();
        jpatrainerinfo.setFname(trainRVM.getFname());
        jpatrainerinfo.setUniy(trainRVM.getUniy());
        jpatrainerinfo.setMajor(trainRVM.getMajor());
        jpatrainerinfo.setGpa(trainRVM.getGpa());
        jpatrainerinfo.setPhone(trainRVM.getPhone());
        jpatrainerinfo.setDot(trainRVM.getDot());
        jpatrainerinfo.setCreatedBy(1L);
        jpatrainerinfo.setCreatedOn(LocalDateTime.now());

        Optional<JpaHospitals> hospital = this.HospitalRepository.findById(Long.parseLong(trainRVM.getHospital()));

        if(!hospital.isPresent()){
            throw new BusinessException(TRError.GENERAL_ERROR);
        }

        jpatrainerinfo.setHospital(hospital.get());


        Jpatrainerinfo user = this.TrainerInfoRepository.save(jpatrainerinfo);
        return user.getId();
    }

    private void hospitals(@NotNull TrainRVM trainRVM){

        if(trainRVM.getHospital() != null){
            Optional<JpaHospitals> byHospital = this.HospitalRepository.findByHospital(trainRVM.getHospital());
            if(byHospital.isPresent()){
            }
        }
        if(trainRVM.getId() != null) {
            Optional<JpaHospitals> byId = this.HospitalRepository.findById(trainRVM.getId());
            if (byId.isPresent()) {}

        }
    }


}
