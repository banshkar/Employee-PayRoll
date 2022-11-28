package com.bridgelabz.exeception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class MyExeceptionAdvice {
	
	@ExceptionHandler(EmployeeExist.class)
	@ResponseBody
	public  ResponseEntity<Object> getresponse(EmployeeExist employeeExist){
		  String message =employeeExist.getMessage();
		return new ResponseEntity<Object>(message, HttpStatus.NOT_FOUND);
	}

}
