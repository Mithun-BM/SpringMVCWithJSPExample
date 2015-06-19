package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Employee;
import com.example.form.data.EmployeeForm;

@Controller
public class EmployeeControllerGetFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeControllerGetFormData.class);

	@RequestMapping(value = "/getEmployeeFormData", method = RequestMethod.GET)
	public String getEmployeeFormData1stWay(Model model) 
	{
		logger.info("Entering getEmployeeFormData1stWay()");
		String returnString = "getEmployeeFormData";
		EmployeeForm form = null;
		if(!model.containsAttribute("employeeForm")){
			form = new EmployeeForm();
			model.addAttribute("employeeForm",form);
		}
		
		form.setEmployeeId(9);
		form.setEmployeeFirstName("Test 1 FN");
		form.setEmployeeLastName("Test 1 LN");
		form.setEmployeeEmail("test1@gmail.com");
		form.setEmployeeDOB("12-09-2015");
		form.setEmployeeAge(27);
		logger.info("Exiting getEmployeeFormData1stWay()");
		return returnString;
	}


	@RequestMapping(value = "/getEmployeeFormData", method = RequestMethod.GET)
	public String getEmployeeFormData2ndWay(Model model) 
	{
	    logger.info("Entering getEmployeeFormData2ndWay()");
		String returnString = "getEmployeeFormData";
		Employee form = null;
		if(!model.containsAttribute("employee")){
			form = new Employee();
			model.addAttribute("employee",form);
		}

		form.setEmployeeId(10);
		form.setEmployeeFirstName("Test 2 FN");
		form.setEmployeeLastName("Test 2 LN");
		form.setEmployeeEmail("test2@gmail.com");
		form.setEmployeeDOB("12-06-2015");
		form.setEmployeeAge(26);
		logger.info("Exiting getEmployeeFormData2ndWay()");
		return returnString;
	}
	
	/*Code Backup - 

	 private static final Logger logger = LoggerFactory
			.getLogger(EmployeeControllerGetFormData.class);

	@RequestMapping(value = "/getEmployeeFormData", method = RequestMethod.GET)
	public String getEmployeeFormData1stWay(Model model) 
	{
		logger.info("Entering getEmployeeFormData1stWay()");
		String returnString = "getEmployeeFormData";
		EmployeeForm form = null;
		if(!model.containsAttribute("employeeForm")){
			form = new EmployeeForm();
			model.addAttribute("employeeForm",form);
		}
		
		form.setEmployeeId(9);
		form.setEmployeeFirstName("Test 1 FN");
		form.setEmployeeLastName("Test 1 LN");
		form.setEmployeeEmail("test1@gmail.com");
		form.setEmployeeDOB("12-09-2015");
		form.setEmployeeAge(27);
		logger.info("Exiting getEmployeeFormData1stWay()");
		return returnString;
	}


	@RequestMapping(value = "/getEmployeeFormData", method = RequestMethod.GET)
	public String getEmployeeFormData2ndWay(Model model) 
	{
	    logger.info("Entering getEmployeeFormData2ndWay()");
		String returnString = "getEmployeeFormData";
		Employee form = null;
		if(!model.containsAttribute("employee")){
			form = new Employee();
			model.addAttribute("employee",form);
		}

		form.setEmployeeId(10);
		form.setEmployeeFirstName("Test 2 FN");
		form.setEmployeeLastName("Test 2 LN");
		form.setEmployeeEmail("test2@gmail.com");
		form.setEmployeeDOB("12-06-2015");
		form.setEmployeeAge(26);
		logger.info("Exiting getEmployeeFormData2ndWay()");
		return returnString;
	}*/

}
