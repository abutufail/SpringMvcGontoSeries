package com.pluralsight.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.plularsight.model.Exercise;

@Controller
public class MinuteController {
	
	
	@RequestMapping("/welcome.ftl")				//for ftl
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("abutufail", name);
        return "welcome";
    }
	
	@RequestMapping("/jquery")				//for ftl
    public String hello1(Model model) {
        model.addAttribute("abutufail", "dsfdf");
        return "jquery";
    }
	@RequestMapping("/jqueryform")				//for ftl
    public String hello2(Model model) {
        model.addAttribute("abu", "dsfdf");
        return "jqueryform";
    }
	
		
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise1") Exercise exercise) {
		
		System.out.println("exercise: " + exercise.getMinutes());
		
		return "addMinutes";
			
		}
	
	@RequestMapping(value="/hi/{userName}")    			// single path variable example from gontu series
public String sayHello (@PathVariable("userName") String name ,Model model) {
		
	
		
		model.addAttribute("greeting", "welcome "+name);
		model.addAttribute("welcome", "welcome again");
		model.addAttribute("bye", "dhamal");
		
		return "greeting";
	}
	
	@RequestMapping(value="/hi1/{userName1}/{country}")    			// multi path variable example from gontu series
public String sayHello1 (@PathVariable Map<String,String> pathvars ,Model model) {

		String name =pathvars.get("userName1");
		String country =pathvars.get("country");
		
		
		model.addAttribute("greeting", "welcome "+name +" "+ "From "+country);
		model.addAttribute("welcome", "welcome again");
		model.addAttribute("bye", "dhamal");
		
		return "greeting";
	}
	
}
