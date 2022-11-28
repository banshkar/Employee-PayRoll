package com.bridgelabz.service;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.bridgelabz.dto.Register;

@Component
public interface IEmployee {
 public ResponseEntity<Object> add(Register registerDto);
 public  ResponseEntity<Object> update(int id,Register emplDto);
 public  ResponseEntity<Object> getDetails(int id);
 public ArrayList<Register> getAllEmployeeDetails();
 public String deleted(int id);
}
