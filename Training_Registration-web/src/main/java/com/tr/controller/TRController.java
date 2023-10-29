package com.tr.controller;


import com.tr.Service.TRService;
import com.tr.Service.TrainerService;
import com.tr.navigation.Navigation;
import com.tr.vm.SignUpVM;
import com.tr.vm.TrainRVM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(Navigation.TR_API_V1)
public class TRController {
    @Autowired
    TRService trService;

    @PostMapping("/signup")
    public ResponseEntity<Map<String, Object>> signup(@RequestBody @Valid SignUpVM signUpVM){
        Long userId = this.trService.signup(signUpVM);
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @Autowired
    TrainerService trainerService;

    @PostMapping("/training")
    public ResponseEntity<Map<String, Object>> training(@RequestBody @Valid TrainRVM trainRVM) {
        Long TR = this.trainerService.trainer(trainRVM);
        Map<String, Object> map = new HashMap<>();
        map.put("TR", TR);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }


}

