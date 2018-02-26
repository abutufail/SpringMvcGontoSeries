package com.pluralsight.admission.controller;

import java.util.Date;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonInclude(JsonInclude.Include.NON_NULL)		// it will  not show the value which is null
//@JsonIgnoreProperties({"studentSkills"})		//it will not show studentSkills in response
@JsonPropertyOrder({"Funky_student_name","studentHobby","studentMobile","studentDOB","studentSkills"})
public class Student {
	@JsonProperty("Funky_student_name")
	@Pattern(regexp="[^0-9]*")
	@NotEmpty
	private String studentName;
	
	@Size(min=2, max=30, message="please enter value Hobby between 2 and 30 character")
	@Size(min=2, max=30)
	private String studentHobby;
	//@Max(222)
	private long studentMobile;
	@Past
	private Date studentDOB;
	private List<String> studentSkills;
	
	private Address studentAddress;		// user define variable:- Address
	
	
	
	public Student() {
		
	}
	public Student(String studentName, String studentHobby, long studentMobile) {
		super();
		this.studentName = studentName;
		this.studentHobby = studentHobby;
		this.studentMobile = studentMobile;
		
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public List<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(List<String> studentSkills) {
		this.studentSkills = studentSkills;
	}

	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}

}
