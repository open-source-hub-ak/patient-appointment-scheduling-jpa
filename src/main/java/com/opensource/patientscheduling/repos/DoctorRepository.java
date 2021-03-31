package com.opensource.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.opensource.patientscheduling.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
