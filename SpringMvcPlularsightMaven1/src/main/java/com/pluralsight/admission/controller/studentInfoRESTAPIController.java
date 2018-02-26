package com.pluralsight.admission.controller;

import java.util.LinkedList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController  			// by this it is not require to metion explicitly @ReponseBody annotation at every method
public class studentInfoRESTAPIController {

	
	//@ResponseBody  	//not require becuase we have mention @RestController at class level 	// by @ResponseBody it will not look for view file and instead it will show the metthod contain directly
	@RequestMapping(value="/students", method = RequestMethod.GET ,produces = MediaType.APPLICATION_JSON_VALUE) //produces it will produce only json format
	public LinkedList<Student> getStudentList(){
		
		
		
		Student student1=new Student("Shahruk","Bolly",222);
		Student student2=new Student("AK","Ninja",222);
		Student student3=new Student("Salman","Gym",222);
//		Student student2=new Student();
//		student2.setStudentName("Honey sigh");
//		
//		Student student3=new Student();
//		student3.setStudentName("Radhe");
		
		LinkedList<Student> studentsList=new LinkedList<Student>();
		
		studentsList.add(student2);
		studentsList.add(student3);
		studentsList.add(student1);
		
		return studentsList;
	}
	
	//@ResponseBody	//not require becuase we have mention @RestController at class level
	@RequestMapping(value="/students/{name}")    			// single path variable example from gontu series
	public Student getStudent (@PathVariable("name") String StudentName) {
			
		
			
			//fetch the student's record using StudentName from database.
		Student student=new Student();
		student.setStudentName(StudentName);
		student.getStudentHobby();
			
			return student;
		}
	
	
	
	
}
