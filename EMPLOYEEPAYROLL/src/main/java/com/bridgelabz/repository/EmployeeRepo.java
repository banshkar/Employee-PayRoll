package com.bridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bridgelabz.model.Model;

public interface EmployeeRepo extends JpaRepository<Model, Integer>{
     public Model findByNameAndDepartment(String name,String department);
   
}
