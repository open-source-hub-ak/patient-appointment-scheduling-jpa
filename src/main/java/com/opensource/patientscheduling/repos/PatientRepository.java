package com.opensource.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.opensource.patientscheduling.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
