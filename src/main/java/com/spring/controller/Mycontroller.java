package com.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Mycontroller {

	@RequestMapping("/test")
	public String test(){
		
		return "Hello World";
	}
	
	@RequestMapping("/model")
	public ModelAndView test1(){
		
		return new ModelAndView("test");
	}
	
	@RequestMapping("/abc")
	public String abc(){
		
		return "Hello World, coming from Html page";
	}
}
