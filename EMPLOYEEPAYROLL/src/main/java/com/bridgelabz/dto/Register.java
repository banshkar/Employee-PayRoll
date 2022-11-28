package com.bridgelabz.dto;

import org.springframework.stereotype.Component;
@Component
public class Register {
	private String name;
	private String profileImage;
	private String gender;
	private String department;
	private String salary;
	private String startDate;
	private String notes;
	public Register() {
		
	}
	public Register(String name, String profileImage, String gender, String department, String salary, String startDate,
			String notes) {
		super();
		this.name = name;
		this.profileImage = profileImage;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.notes = notes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}	
}
