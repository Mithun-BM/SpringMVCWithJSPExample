package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Fourth Way Of Spring MVC Controller
@Controller
@RequestMapping
public class HelloWorldController4{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController4.class);

	@RequestMapping(value = "/helloWorldMessage4/getHelloMessage" , method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController4 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController4 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(value = "/helloWorldMessage4/postHelloMessage" , method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController4 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController4 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}
}

/*//Code Backup 
@Controller
@RequestMapping
public class HelloWorldController4{

	private static final Logger logger = LoggerFactory
			.getLogger(HelloWorldController4.class);

	@RequestMapping(value = "/helloWorldMessage4/getHelloMessage" , method = RequestMethod.GET)
	public String getHelloMessage(Model model) {
		logger.info("Inside HelloWorldController4 --> getHelloMessage()");
		model.addAttribute("message", "HelloWorldController4 Spring MVC Framework!");
		return "helloWorld";
	}

	@RequestMapping(value = "/helloWorldMessage4/postHelloMessage" , method = RequestMethod.POST)
	public String postHelloMessage(Model model) {
		logger.info("Inside HelloWorldController4 --> postHelloMessage()");
		model.addAttribute("message", "HelloWorldController4 Spring MVC Framework! Data Posted Successfully");
		return "helloWorld";
	}
}*/