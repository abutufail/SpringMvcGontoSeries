package com.pluralsight.admission.controller;

import java.text.SimpleDateFormat;

import java.util.Date;
//import java.util.logging.Logger;

import javax.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
//import org.slf4j.Logger;
//import org.slf4j.Logger;
//import org.apache.log4j.*;
//import org.slf4j.LoggerFactory;
 

//import com.plularsight.model.Exercise;



@Controller
public class StudentAdmissionController {
	//private static final Logger LOGGER = Logger.getLogger( StudentAdmissionController.class.getName() );   			//ok
	//private static org.apache.log4j.Logger log = Logger.getLogger(StudentAdmissionController.class);
	//private static final Logger LOGGER = LoggerFactory.getLogger(StudentAdmissionController.class);
	
	
	@InitBinder
	public void initBinder1(WebDataBinder binder) {
		//binder.setDisallowedFields(new String[] {"studentMobile"});   //it will not bind the mobile data and will not show in AdmissionSucess.jsp
	
		 SimpleDateFormat dateFormat = new SimpleDateFormat("dd*MM*yyyy");							//for date format
		     binder.registerCustomEditor(Date.class,"studentDOB" ,new CustomDateEditor(dateFormat, true));
	}
	
	
	@ModelAttribute
	public void addingCommonObjeects(Model model1) {
		
	//LOGGER.debug("hello fgfkjgdfgdfjgdfgkj", StudentAdmissionController.class);
		//logs debug message
//				if(LOGGER.isDebugEnabled()){
//					LOGGER.debug("getWelcome is executed!######");
//				}
		model1.addAttribute("headermsg","ABUSK COlllege of engineeering And Managemet Research");
//		LOGGER.info("ending#######" , StudentAdmissionController.class);
	}
	

	@RequestMapping(value ="/admissionForm" , method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView model = new ModelAndView("AdmissionForm");
		//model.addObject("headermsg","Gontu COlllege of engineeering");
		
		return model;
	}
	
//	@RequestMapping(value ="/submitAdmissionForm" , method = RequestMethod.POST)
//		public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {
//		
////		String name=reqPar.get("studentName");
////		String hobby=reqPar.get("studentHobby");
////		ModelAndView model = new ModelAndView("AdmissionSuccess");
////		model.addObject("msg","your name"+name +" , hobby is"+hobby);   // here put only ${msg} in AdmissionSuccess.jsp file		
//		
//		return model;
//		 
//	}

//	@RequestMapping(value ="/submitAdmissionForm" , method = RequestMethod.POST)   // without @ModelAttribute
//	public ModelAndView submitAdmissionForm(@RequestParam(value="studentName",  defaultValue="xxx")String name , @RequestParam("studentHobby")String hobby) {
//		//public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar) {
//			
//		Student student1 = new Student();
//		student1.setStudentName(name);
//		student1.setStudentHobby(hobby);
//		
//		ModelAndView model = new ModelAndView("AdmissionSuccess");
//		model.addObject("header","Gontu COlllege of engineeering");
//		model.addObject("student1",student1);
//		
//		
//		return model;
//		
//	}
	
	
	
	
	
	@RequestMapping(value ="/submitAdmissionForm" , method = RequestMethod.POST)   	//with modelAttribute as method argument
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student1 , BindingResult result ) {   //@Valid is for

		//@Modelattribute will elimnate the following 4 line of code:-
			
//		Student student1 = new Student();
//		student1.setStudentName(name);
//		student1.setStudentHobby(hobby);
		
		if(result.hasErrors() ) {
						
			ModelAndView model1 = new ModelAndView("AdmissionForm");		//redirecting to the same page 
			BeanUtils.copyProperties(model1, student1);
			return model1;	
	         
		}
		
		else {
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");		//it will asign the @ModelAttribute value to AdmissionSucces page
		//model.addObject("headermsg","Gontu COlllege of engineeering");
//		model.addObject("student1",student1);		//@Modelattribute will eliminate this line of code		
		
		return model1;
		}
		
		
		
		
	}
	

	
	
	
	//	public String sayHello (Model model) {
//		
//		model.addAttribute("greeting", "again hello World. we have gather here for spring bsic with html and css");
//		model.addAttribute("welcome", "welcome to new world of spring mvc");
//		model.addAttribute("bye", "see you again");
//		return "greeting";
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(value = "/addMinutes")
//	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		
//		System.out.println("exercise: " + exercise.getMinutes());
//		
//		return "addMinutes";
//			
//		}
//	

	
	
//	public String hi (Model model) {
//		
//		model.addAttribute("welcome", "welcome to new world of spring mvc");
//		
//		return "greeting";
//	}
	
	

}