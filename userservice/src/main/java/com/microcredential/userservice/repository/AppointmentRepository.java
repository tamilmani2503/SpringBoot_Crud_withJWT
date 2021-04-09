package com.microcredential.userservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microcredential.userservice.model.Appointments;

public interface AppointmentRepository extends JpaRepository<Appointments, Integer> {

	List<Appointments> findAllAppointmentsByUserId(Integer userId);

	

}







	

