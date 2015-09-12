package com.example.form.usage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Person;
import com.example.form.data.PersonForm;

@Controller
public class PersonControllerGetFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(PersonControllerGetFormData.class);

	//First Way
	@RequestMapping(value = "/getPersonFormData1stWay", method = RequestMethod.GET)
	public String getPersonFormData1stWay(Model model) 
	{
		logger.info("Entering getPersonFormData1stWay()");
		String returnString = "getPersonFormData";
		PersonForm form = null;
		if(!model.containsAttribute("personForm")){//For this please use modelAttribute="personForm" in personLoginForm.jsp
			form = new PersonForm();
			model.addAttribute("personForm",form);
		}

		form.setFname("Test1 fname");
		form.setMname("Test1 mname");
		form.setLname("Test1 lname");
		form.setAge(20);
		form.setCar(3);
		form.setEmail("Test1@gmail.com");
		form.setPhoneNumber("9999999999");
		form.setMaxLengthCheck("3");
		form.setMinLengthCheck("1");

		logger.info("Exiting getPersonFormData1stWay()");
		return returnString;
	}

	//OR

	//Second Way
	@RequestMapping(value = "/getPersonFormData2ndWay", method = RequestMethod.GET)
	public String getPersonFormData2ndWay(Model model) 
	{
		logger.info("Entering getPersonFormData2ndWay()");
		String returnString = "getPersonFormData";
		Person form = null;
		if(!model.containsAttribute("person")){//For this please use modelAttribute="person" in personLoginForm.jsp
			form = new Person();
			model.addAttribute("person",form);
		}

		form.setFname("Test2 fname");
		form.setMname("Test2 mname");
		form.setLname("Test2 lname");
		form.setAge(20);
		form.setCar(3);
		form.setEmail("Test2@gmail.com");
		form.setPhoneNumber("111111111");
		form.setMaxLengthCheck("4");
		form.setMinLengthCheck("2");

		logger.info("Exiting getPersonFormData2ndWay()");
		return returnString;
	}

	/*Code Backup -

	private static final Logger logger = LoggerFactory
	.getLogger(PersonControllerGetFormData.class);

	//First Way
	@RequestMapping(value = "/getPersonFormData1stWay", method = RequestMethod.GET)
	public String getPersonFormData1stWay(Model model) 
	{
		logger.info("Entering getPersonFormData1stWay()");
		String returnString = "getPersonFormData";
		PersonForm form = null;
		if(!model.containsAttribute("personForm")){//For this please use modelAttribute="personForm" in personLoginForm.jsp
			form = new PersonForm();
			model.addAttribute("personForm",form);
		}

		form.setFname("Test1 fname");
		form.setMname("Test1 mname");
		form.setLname("Test1 lname");
		form.setAge(20);
		form.setCar(3);
		form.setEmail("Test1@gmail.com");
		form.setPhoneNumber("9999999999");
		form.setMaxLengthCheck("3");
		form.setMinLengthCheck("1");

		logger.info("Exiting getPersonFormData1stWay()");
		return returnString;
	}

	//OR

	//Second Way
	@RequestMapping(value = "/getPersonFormData2ndWay", method = RequestMethod.GET)
	public String getPersonFormData2ndWay(Model model) 
	{
		logger.info("Entering getPersonFormData2ndWay()");
		String returnString = "getPersonFormData";
		Person form = null;
		if(!model.containsAttribute("person")){//For this please use modelAttribute="person" in personLoginForm.jsp
			form = new Person();
			model.addAttribute("person",form);
		}

		form.setFname("Test2 fname");
		form.setMname("Test2 mname");
		form.setLname("Test2 lname");
		form.setAge(20);
		form.setCar(3);
		form.setEmail("Test2@gmail.com");
		form.setPhoneNumber("111111111");
		form.setMaxLengthCheck("4");
		form.setMinLengthCheck("2");

		logger.info("Exiting getPersonFormData2ndWay()");
		return returnString;
	}*/
}
