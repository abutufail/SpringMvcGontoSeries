package com.pluralsight.admission.controller;

import java.util.Calendar;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger LOGGER = Logger.getLogger(DayOfWeekBasedAccessInterceptor.class.getName());
	
	@Override
	public boolean preHandle(HttpServletRequest request,					//preHandle method it's initiate before all method's in controller3
			HttpServletResponse response, Object handler) throws Exception { 
		
		Calendar cal = Calendar.getInstance();
		int dayofweek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayofweek ==5) {		//1 is sunday
			response.getWriter().write("the website is closed on Sunday:please:please try accessing it" + "on any other week day!!");   
			return false;
		}
				return true;
	}
	
	
	@Override
	public void postHandle(
	  HttpServletRequest request, 
	  HttpServletResponse response,
	  Object handler, 
	  ModelAndView modelAndView) throws Exception {
		//System.out.println("it postHandler is called " +request.getRequestURI().toString());
		LOGGER.info("it postHandler is called " +request.getRequestURI().toString());
	   
	}
	
	@Override
	public void afterCompletion(
	  HttpServletRequest request, 
	  HttpServletResponse response,
	  Object handler, Exception ex) {
		
		LOGGER.info("it afterComletion is called " +request.getRequestURI().toString()+response.encodeUrl(null));
	}
	
	

}

