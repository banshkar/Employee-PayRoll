package com.bridgelabz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Model {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String name;
	private String profileImage;
	private String gender;
	private String department;
	private String salary;
	private String startDate;
	private String notes;
	
	public Model() {
	
	}
	public Model(int id, String name, String profileImage, String gender, String department, String salary,
			String startDate, String notes) {
		super();
		this.id = id;
		this.name = name;
		this.profileImage = profileImage;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.notes = notes;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name + ", profileImage=" + profileImage + ", gender=" + gender
				+ ", department=" + department +  ", salary=" + salary + ", startDate="
				+ startDate + ", notes=" + notes  + "]";
	}
	
	
	

}
