package com.bridgelabz.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bridgelabz.dto.Register;
import com.bridgelabz.service.IEmployee;
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	 @Autowired
	 private IEmployee employee;
	
	 @PostMapping("/add")
	 public ResponseEntity<Object> addEmployee(Register empDto) {
		return  this.employee.add(empDto);
	}
	@PutMapping("/update")
	public ResponseEntity<Object> update(@RequestParam int employeeId ,@RequestBody Register empDto){
		 return this.employee.update(employeeId, empDto);
	}
	@GetMapping("/getDetails")
	public ResponseEntity<Object>getDetails(@RequestParam int employeeId){
		return this.employee.getDetails(employeeId);
	}
	@GetMapping("/getAllEmployeeDetails")
	public ResponseEntity<ArrayList<Register>> getAllEmaployeeDetails(){
		return new ResponseEntity<ArrayList<Register>>(this.employee.getAllEmployeeDetails(),HttpStatus.OK);
	}
	@DeleteMapping("/deleted")
	public ResponseEntity<String>deleted(@RequestParam int employeeId){
		return new ResponseEntity<String>(this.employee.deleted(employeeId),HttpStatus.OK);
	}

}
 