package com.balance.api.balanceapi.web;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.balance.api.balanceapi.service.IAttendeeService;
import com.balance.api.balanceapi.domain.Attendee;

import java.util.List;

@RestController
@RequestMapping("attendee")
public class AttendeeController {
	
	@Autowired
  	private IAttendeeService attendeeService;

	@RequestMapping("/test")
	@CrossOrigin(origins = "http://localhost:4200")
	public String helloWorld() {        
  	return "Balance API";
	}

	@GetMapping("/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public @ResponseBody Attendee findAttendeeById(@PathVariable Long id) {
    	return this.attendeeService.findById(id);
	}

	@GetMapping("/all")
	@CrossOrigin(origins = "http://localhost:4200")
	public @ResponseBody List<Attendee> getAllAttendees() {
		return this.attendeeService.findAll();
	}
}
