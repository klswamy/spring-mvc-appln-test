package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.service.EmpService;

@RestController
@RequestMapping("/rest")
public class EmpRestController {
	@Autowired
	private EmpService service;
	@PostMapping("/")
	public ResponseEntity<?> saveEmp(@RequestBody Employee employee){
		String msg=service.save(employee);
		
		
		
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		
	}

}
