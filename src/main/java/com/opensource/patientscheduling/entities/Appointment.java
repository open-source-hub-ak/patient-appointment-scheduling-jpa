package com.opensource.patientscheduling.entities;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Timestamp appointmentTime;
	private boolean started;
	private boolean ended;
	private String reason;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(Timestamp appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public boolean getStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean getEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", appointmentTime=" + appointmentTime + ", reason=" + reason + "]";
	}

}
