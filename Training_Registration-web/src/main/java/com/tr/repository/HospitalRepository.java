package com.tr.repository;

import com.tr.model.JpaHospitals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface
HospitalRepository extends JpaRepository<JpaHospitals, Long> {

    Optional<JpaHospitals> findById(Long id);
     Optional<JpaHospitals> findByHospital(String hospital);


}
