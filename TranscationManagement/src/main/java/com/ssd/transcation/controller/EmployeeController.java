package com.ssd.transcation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ssd.transcation.dto.EmployeeDto;
import com.ssd.transcation.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/save")
	public ResponseEntity<String>saveEmployee(@RequestBody EmployeeDto employee){
		return ResponseEntity.ok(service.saveEmployee(employee));
		
	}

}
