package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Second Way Of Spring MVC Controller
@Controller
@RequestMapping("/helloWorldMessage2")
public class HelloWorldController2{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController2.class);

	@RequestMapping(method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController2 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController2 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController2 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController2 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}

}

/*//Code Backup 
@Controller
@RequestMapping("/helloWorldMessage2")
public class HelloWorldController2{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController2.class);

	@RequestMapping(method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController2 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController2 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController2 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController2 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}*/