package com.bridgelabz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.bridgelabz.dto.Register;
import com.bridgelabz.exeception.EmployeeExist;
import com.bridgelabz.exeception.ResponseHandler;
import com.bridgelabz.model.Model;
import com.bridgelabz.repository.EmployeeRepo;
@Service
public class EmployeeServiceImp implements IEmployee{
    @Autowired
	private EmployeeRepo repo;
    @Autowired
    ModelMapper mapper;
    @Autowired
    ResponseHandler responsehandler;
	@Override
	public ResponseEntity<Object> add(Register registerDto) {
        if(this.repo.findByNameAndDepartment(registerDto.getName(), registerDto.getDepartment())==null) {
               Model employee =mapper.map(registerDto, Model.class);
               this.repo.save(employee);
             return responsehandler.getResponse(" Add Employee Successfully",registerDto,HttpStatus.OK);       
        }
        else {
        	 
 			throw new EmployeeExist("This employee Already Exist ");
        }     
	}

	@Override
	public ResponseEntity<Object> update(int id,Register emplDto) {
		 if(this.repo.findById(id)!=null) {
			 Model upemployee=mapper.map(emplDto, Model.class);
			 upemployee.setId(id);
			 this.repo.save(upemployee);    
	          return responsehandler.getResponse(" Update Employee Successfully",emplDto,HttpStatus.OK);	
	        }
	      throw new EmployeeExist("This Employee does not Exist");
	}

	@Override
	public ResponseEntity<Object> getDetails(int id) {
		if(this.repo.findById(id).isPresent())  {
			Model employee = this.repo.findById(id).get();
			Register empDetails =mapper.map(employee, Register.class);
			return responsehandler.getResponse(" Employee Details",empDetails,HttpStatus.OK);}
		else {
			   	
			throw new EmployeeExist("This employee does not exist");
		}
	}
	@Override
	public ArrayList<Register> getAllEmployeeDetails() {
	    if(this.repo.findAll()!=null) {
	    	 List<Model> empList=this.repo.findAll();
	    
	  ArrayList<Register> allEmpListDetails= (ArrayList<Register>) empList.stream().map(e->mapper.map(e, Register.class)).collect(Collectors.toList());
	   return allEmpListDetails;
	    }
	  throw new EmployeeExist();
	}
	@Override
	public String deleted(int id) {
		if(this.repo.findById(id).isPresent()) {
			this.repo.deleteById(id);
			return "Employee Deleted Successfully";
		}
		throw new EmployeeExist("This Emaployee does not exist");
	}
}
