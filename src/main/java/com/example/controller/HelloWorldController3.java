package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Third Way Of Spring MVC Controller
@Controller
public class HelloWorldController3{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController3.class);

	@RequestMapping(value = "/getHelloMessage", method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController3 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController3 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(value = "/postHelloMessage" , method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController3 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController3 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}
}

/*//Code Backup 
@Controller
public class HelloWorldController3{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController3.class);

	@RequestMapping(value = "/getHelloMessage", method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController3 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController3 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(value = "/postHelloMessage" , method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController3 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController3 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}
}*/

