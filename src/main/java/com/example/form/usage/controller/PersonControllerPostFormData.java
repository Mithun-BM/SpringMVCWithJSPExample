package com.example.form.usage.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Person;

@Controller
public class PersonControllerPostFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(PersonControllerPostFormData.class);

	/*@RequestMapping(value = "/person", method = RequestMethod.GET) 
	public ModelAndView showPersonLoginPage2ndWay() { 
		logger.info("Inside showPersonLoginPage2ndWay()");
		return new ModelAndView("personLoginForm", "person", new Person());  
	}*/

	//OR

	@ModelAttribute("person")
	public Person createPersonModel() 
	{
		logger.info("Inside createPersonModel()");
		return new Person();
	}

	@RequestMapping(value="/person", method = RequestMethod.GET)
	public String showPersonLoginPage1stWay() 
	{
		logger.info("Inside showPersonLoginPage1stWay()");
		return "personLoginForm";
	}

	@RequestMapping(value = "/postPersonFormData", method = RequestMethod.POST)
	public String postPersonFormData(@ModelAttribute("person")  @Valid Person person, BindingResult result, Model model) 
	{//Doing server side validations using @Valid Annotation(javax & hibernate validation)
		logger.info("Entering postPersonFormData()");
		String returnString = "personLoginForm";
		if(!result.hasErrors()){
			model.addAttribute("personResponse", person);
			logger.info("Exiting postPersonFormData()");
			returnString = "personPostSuccessDetails";
		}
		return returnString;
	}

}
