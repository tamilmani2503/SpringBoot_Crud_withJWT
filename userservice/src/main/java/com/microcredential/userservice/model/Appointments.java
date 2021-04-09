package com.microcredential.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Appointment")
public class Appointments {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long appointmentId;
	@Column(name="userId")
	private Integer userId;
	@Column(name="title")
	private String title;
	@Column(name="appointment_type")
	private String appointmentType;
	@Column(name="appointment_date")
	private String appointmentDate;
	@Column(name="comments")
	private String comments;
	@Column(name="location")
	private String location;
	
	
	
	public Appointments(long appointmentId, Integer userId, String title, String appointmentType,
			String appointmentDate, String comments, String location) {
		super();
		this.appointmentId = appointmentId;
		this.userId = userId;
		this.title = title;
		this.appointmentType = appointmentType;
		this.appointmentDate = appointmentDate;
		this.comments = comments;
		this.location = location;
	}
	
	
	public Appointments() {
		super();
	}


	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAppointmentType() {
		return appointmentType;
	}
	public void setAppointmentType(String appointmentType) {
		this.appointmentType = appointmentType;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
