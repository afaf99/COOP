package com.tr.Service;

import com.tr.vm.TrainRVM;
import org.springframework.beans.factory.annotation.Autowired;

public interface TrainerService {

       @Autowired
       public Long trainer(TrainRVM trainRVM);



}

