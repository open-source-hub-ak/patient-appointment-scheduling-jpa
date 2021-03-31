package com.opensource.patientscheduling.repos;

import org.springframework.data.repository.CrudRepository;

import com.opensource.patientscheduling.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
