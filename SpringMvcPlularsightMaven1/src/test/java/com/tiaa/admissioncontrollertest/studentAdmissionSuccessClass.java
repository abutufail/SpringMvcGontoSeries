package com.tiaa.admissioncontrollertest;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.experimental.categories.Category;
//import org.junit.platform.runner.JUnitPlatform;
//import org.junit.platform.suite.api.SelectClasses;
//import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;




//@RunWith(JUnitPlatform.class)
//@SelectPackages("com.tiaa.admissioncontrollertest") 		// for all class within package 

//@RunWith(Suite.class)					junit 5
//@SelectClasses( {admissionControllerTest.class} )
//@Suite.SuiteClasses({admissionControllerTest.class})

//@RunWith(Suite.class)				 //commented for junit4   //without category
//@Suite.SuiteClasses({admissionControllerTest.class})   // multiple class

@RunWith(Categories.class)
@IncludeCategory(goodTestCategory.class)		//it will include only the test method witch is annoted with @Category(goodTestCategory.class)
@Suite.SuiteClasses({admissionControllerTest.class})   // multiple class
public class studentAdmissionSuccessClass {

}
