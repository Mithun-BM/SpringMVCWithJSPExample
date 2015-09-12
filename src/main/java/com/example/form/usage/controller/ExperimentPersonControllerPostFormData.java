package com.example.form.usage.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Person;

@Controller
//Use either this annotation //OR session.setAttribute("personResponse", person);
//@SessionAttributes(value = "personResponse")//Session Attribute Usage example
public class ExperimentPersonControllerPostFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(ExperimentPersonControllerPostFormData.class);

	/*//First Way
	@RequestMapping(value = "/experimentperson", method = RequestMethod.GET) 
	public ModelAndView showPersonLoginPage1stWay() { 
		logger.info("Inside showPersonLoginPage1stWay()");
		return new ModelAndView("experimentPersonLoginForm", "person", new Person());  
	}*/

	//OR

	/*//Second Way
	@ModelAttribute("person")
	public Person createPersonModel() 
	{
		logger.info("Inside createPersonModel()");
		return new Person();
	}

	@RequestMapping(value="/experimentperson", method = RequestMethod.GET)
	public String showPersonLoginPage2ndWay() 
	{
		logger.info("Inside showPersonLoginPage2ndWay()");
		return "experimentPersonLoginForm";
	}*/

	//OR
	
	//Third Way
	@RequestMapping(value = "/experimentperson" , method = RequestMethod.GET)
	public String showPersonLoginPage3rdWay(Model model) {
		logger.info("Entering showPersonLoginPage3rdWay()");
		Person personForm = new Person();
		model.addAttribute("person",personForm);
		logger.info("Exiting showPersonLoginPage3rdWay()");
		return "experimentPersonLoginForm";
	}


	/*@RequestMapping(value = "/postExperimentPersonFormData", method = RequestMethod.POST)
	public String postExperimentPersonFormData(@ModelAttribute("person")  @Valid Person person, BindingResult result, Model model) 
	{//Doing server side validations using @Valid Annotation(javax & hibernate validation)
		logger.info("Entering postExperimentPersonFormData()");
		String returnString = "personLoginForm";
		if(!result.hasErrors()){
			model.addAttribute("personResponse", person);
			logger.info("Exiting postExperimentPersonFormData()");
			returnString = "personPostSuccessDetails";
		}
		return returnString;
	}*/
	
	//Session Usage example
	@RequestMapping(value = "/personSessionUsageExample", method = RequestMethod.POST)
	public String personSessionUsageExample(@ModelAttribute("person")  @Valid Person person, BindingResult result, Model model, HttpSession session) 
	{//Doing server side validations using @Valid Annotation(javax & hibernate validation)
		logger.info("Entering personSessionUsageExample()");
		String returnString = "experimentPersonLoginForm";
		if(!result.hasErrors()){
			model.addAttribute("personResponse", person);//model values available only to redirected jsp's.
			
			//setting session attribute using HttpSession session.setAttribute("personResponse", person). Available throughout the session.
			session.setAttribute("personResponse", person);
			returnString = "personPostSuccessDetails";
		}
		logger.info("Exiting personSessionUsageExample()");
		return returnString;
	}

}
