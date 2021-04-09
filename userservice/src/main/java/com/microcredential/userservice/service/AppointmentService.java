package com.microcredential.userservice.service;

import java.util.List;

import com.microcredential.userservice.model.Appointments;

public interface AppointmentService {

	void saveAppointment(Appointments appointment);

	List<Appointments> getAppointmentByUserId(Integer userId);

}
