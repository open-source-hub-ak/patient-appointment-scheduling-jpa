package com.opensource.patientscheduling;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.opensource.patientscheduling.entities.Appointment;
import com.opensource.patientscheduling.entities.Doctor;
import com.opensource.patientscheduling.entities.Insurance;
import com.opensource.patientscheduling.entities.Patient;
import com.opensource.patientscheduling.repos.AppointmentRepository;
import com.opensource.patientscheduling.repos.DoctorRepository;
import com.opensource.patientscheduling.repos.PatientRepository;

@SpringBootTest
class PatientschedulingJpaApplicationTests {

	@Autowired
	private DoctorRepository doctorRepository;

	@Autowired
	private PatientRepository patientRepository;

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Test
	void testCreateDoctor() {
		Doctor doctor = new Doctor();
		doctor.setFirstName("Bharath");
		doctor.setLastName("Thippyreddy");
		doctor.setSpeciality("All");
		doctorRepository.save(doctor);
	}

	@Test
	void testCreatePatient() {
		Patient patient = new Patient();

		patient.setFirstName("Akash");
		patient.setLastName("K");
		patient.setPhone("999999999");

		Insurance insurance = new Insurance();
		insurance.setProviderName("Blue Cross Blue Shield");
		insurance.setCopay(20d);

		patient.setInsurance(insurance);

		Doctor doctor = doctorRepository.findById(1L).get();
		List<Doctor> doctors = new ArrayList<>();
		doctors.add(doctor);
		patient.setDoctors(doctors);

		patientRepository.save(patient);
	}

	@Test
	void testCreateAppointment() {

		Appointment appointment = new Appointment();

		appointment.setAppointmentTime(new Timestamp(new Date().getTime()));
		appointment.setReason("I have problem");
		appointment.setStarted(true);
		appointment.setPatient(patientRepository.findById(1L).get());
		appointment.setDoctor(doctorRepository.findById(1L).get());

		appointmentRepository.save(appointment);
	}

}
