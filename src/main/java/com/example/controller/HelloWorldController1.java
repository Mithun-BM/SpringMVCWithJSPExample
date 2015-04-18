package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//First Way Of Spring MVC Controller
@Controller
@RequestMapping("/helloWorldMessage1")
public class HelloWorldController1{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController1.class);

	@RequestMapping(value = "/getHelloMessage" , method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController1 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController1 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(value = "/postHelloMessage" , method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController1 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController1 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}
}

/*//Code Backup 
@Controller
@RequestMapping("/helloWorldMessage1")
public class HelloWorldController1{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController1.class);

	@RequestMapping(value = "/getHelloMessage" , method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController1 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController1 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(value = "/postHelloMessage" , method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController1 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController1 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}
}*/