package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.plularsight.model.Exercise;

@Controller
public class HelloController {

	@RequestMapping(value ="/greeting")
	public String sayHello (Model model) {
		
		model.addAttribute("greeting", "again hello World. we have gather here for spring bsic with html and css");
		model.addAttribute("welcome", "welcome to new world of spring mvc");
		model.addAttribute("bye", "see you again");
		return "greeting";
	}
	
//	@RequestMapping(value = "/addMinutes")
//	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise) {
//		
//		System.out.println("exercise: " + exercise.getMinutes());
//		
//		return "addMinutes";
//			
//		}
//	
}
	
	
//	public String hi (Model model) {
//		
//		model.addAttribute("welcome", "welcome to new world of spring mvc");
//		
//		return "greeting";
//	}
	
	

