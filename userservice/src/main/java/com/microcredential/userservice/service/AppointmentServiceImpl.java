package com.microcredential.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.microcredential.userservice.model.Appointments;
import com.microcredential.userservice.repository.AppointmentRepository;

@Component
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	AppointmentRepository repository;

	@Override
	public void saveAppointment(Appointments appointment) {

		repository.save(appointment);
	}

	@Override
	public List<Appointments> getAppointmentByUserId(Integer userId) {
		return repository.findAllAppointmentsByUserId(userId);
	}

}
