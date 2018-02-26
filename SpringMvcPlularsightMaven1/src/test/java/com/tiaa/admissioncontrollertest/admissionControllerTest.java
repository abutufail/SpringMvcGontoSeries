package com.tiaa.admissioncontrollertest;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.internal.runners.SuiteMethod;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.admission.controller.Student;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.runner.TestCaseClassLoader;



public class admissionControllerTest{
	
//	@Autowired
//	Student student1;
	
	private Student student;

	@BeforeClass     ///  junit4not woring
	//@BeforeAll			//  junit5
	public static void beforeClass()		// will execute once before everything
	{
		
		System.out.println("before  all class");	
		
	}
	
	@AfterClass 			// junit4 
	//@AfterAll				// junit5
	public static void afterClass()			// will execute once after everything is executed
	{
		
		System.out.println("After all class");	
		
	}
	
	
	//@BeforeEach				// junit 5 will execute before each test method
	@Before				// junit 4 will execute before each test method
	public void setUp()
	{
		
		System.out.println("before method");	
		Student student=new Student();
	}
	
	
	//@AfterEach				// junit 5 will exicute after each test method
	@After					// junit 4 will exicute after each test method
	public void setUp1()
	{
		
		System.out.println("after method");	

	}
	
	
	
	//@Ignore								// it will ignore this method
	@Test
	@Category(goodTestCategory.class)		//categorizing the test method
	public void StudentMobileTest(){
		//fail("not yet implimented");   // this will fail , just to check the j unit is runnig properly
		
		Student student = new Student();
		student.setStudentMobile(222);
		assertEquals("is not equal" , 222 , student.getStudentMobile() );
		System.out.println("StudentMobileTest");
	
		
	}
	//@Test(timeout = 200) 		//test method execution time in mili second
	@Test
	@Category(goodTestCategory.class)		//categorizing the test method
	public void studentNameTest(){
		//fail("not yet implimented");   // this will fail , just to check the j unit is runnig properly
		
		Student student = new Student();
		student.setStudentHobby("abutufail");
		assertEquals("is not equal" , "abutufail" , student.getStudentHobby() );
		System.out.println("studentNameTest");
	
		
	}
	
//	@Test(expected = InvalidStudentNameException.class) 			//add if statement and add exception InvalidStudentNameException and make a class of its name
//	public void InvalidStudentNameException() {
//		
//		student.notify();    	//or other method call
//	}

}
