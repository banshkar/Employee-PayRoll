package com.bridgelabz.exeception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ResponseHandler {
       
	public  ResponseEntity<Object>getResponse(String message,Object response,HttpStatus status){
		Map<String ,Object> map =new HashMap<>();
		map.put("result", response);
		map.put("messgage", message);
		return new ResponseEntity<Object>(map,status);
		
	}
	public  ResponseEntity<Object>getResponse(String message,HttpStatus status){
		Map<String ,Object> map =new HashMap<>();
		map.put("messgage", message);
		map.put("status", status);
		return new ResponseEntity<Object>(map,status);
		
	}
}
