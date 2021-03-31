package com.opensource.patientscheduling;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.opensource.patientscheduling.entities.Doctor;
import com.opensource.patientscheduling.repos.DoctorRepository;
import com.opensource.patientscheduling.repos.PatientRepository;

@SpringBootTest
class PatientschedulingJpaApplicationTests {

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private PatientRepository patientRepository;

	@Test
	void testCreateDoctor() {
		Doctor doctor = new Doctor();
		doctor.setFirstName("Bharath");
		doctor.setLastName("Thippyreddy");
		doctor.setSpeciality("All");
		doctorRepository.save(doctor);
	}

}
