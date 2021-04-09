package com.microcredential.userservice.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microcredential.userservice.model.Appointments;
import com.microcredential.userservice.service.AppointmentService;
import com.microcredential.userservice.service.JWTTokenUtil;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(path="/api/v1/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@Autowired
	JWTTokenUtil tokenUtil;

	@PostMapping("/add")
	public ResponseEntity<?> saveAppointment(@RequestHeader Map<String,String> header,  @RequestBody Appointments appointment) {
		try {
			appointment.setUserId(tokenUtil.validateToken(header.get("token")));
			appointmentService.saveAppointment(appointment);
			return new ResponseEntity<>(HttpStatus.CREATED);			
		}catch (Exception e) {
			return new ResponseEntity<String>("{ \"message\":\""+e.getMessage(), HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAppointments(@RequestHeader Map<String,String> header ) {
		List<Appointments> appt = appointmentService.
				getAppointmentByUserId(tokenUtil.validateToken(header.get("token")));
		return new ResponseEntity<>(appt, HttpStatus.OK);
	}
}
