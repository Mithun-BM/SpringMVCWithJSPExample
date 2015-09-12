package com.example.form.usage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Employee;
import com.example.form.data.EmployeeForm;

@Controller
public class ExperimentEmployeeControllerGetFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(ExperimentEmployeeControllerGetFormData.class);

	//First Way
	@RequestMapping(value = "/experimentGetEmployeeFormData1stWay", method = RequestMethod.GET)
	public String getEmployeeFormData1stWay(Model model) 
	{
		logger.info("Entering getEmployeeFormData1stWay()");
		String returnString = "experimentGetEmployeeFormData";
		EmployeeForm form = null;
		if(!model.containsAttribute("employeeForm")){//For this please use modelAttribute="employeeForm" in employeeLoginForm.jsp 
			form = new EmployeeForm();
			model.addAttribute("employeeForm",form);
		}
		model.addAttribute("dummyValue","DUMMY VALUE 1");
		form.setEmployeeId(9);
		form.setEmployeeFirstName("Test 1 FN");
		form.setEmployeeLastName("Test 1 LN");
		form.setEmployeeEmail("test1@gmail.com");
		form.setEmployeeDOB("12-09-2015");
		form.setEmployeeAge(27);
		logger.info("Exiting getEmployeeFormData1stWay()");
		return returnString;
	}

	//OR

	//Second Way
	@RequestMapping(value = "/experimentGetEmployeeFormData2ndWay", method = RequestMethod.GET)
	public String getEmployeeFormData2ndWay(Model model) 
	{
		logger.info("Entering getEmployeeFormData2ndWay()");
		String returnString = "experimentGetEmployeeFormData";
		Employee form = null;
		if(!model.containsAttribute("employee")){//For this please use modelAttribute="employee" in employeeLoginForm.jsp
			form = new Employee();
			model.addAttribute("employee",form);
		}

		model.addAttribute("dummyValue","DUMMY VALUE 1");
		form.setEmployeeId(10);
		form.setEmployeeFirstName("Test 2 FN");
		form.setEmployeeLastName("Test 2 LN");
		form.setEmployeeEmail("test2@gmail.com");
		form.setEmployeeDOB("12-06-2015");
		form.setEmployeeAge(26);
		logger.info("Exiting getEmployeeFormData2ndWay()");
		return returnString;
	}

	//Receiving RequestParameter through Data Binding according to field attribute.
	@RequestMapping(value = "/requestParamBindingWay", method = RequestMethod.GET)
	public String requestParamBindingWay(Model model,@RequestParam("bindingEmpFName") String employeeFirstName,@RequestParam("bindingEmpLName") String employeeLastName,@RequestParam("employeeAge") String employeeAge) 
	{//bindingEmpFName & bindingEmpLName should be same as in requestParamBindingWay.jsp name attribute. 
		//OR employeeAge should be same as in requestParamBindingWay.jsp path attribute. 
		logger.info("Entering requestParamBindingWay()");
		model.addAttribute("requestParamBindingWayFName", employeeFirstName);
		model.addAttribute("requestParamBindingWayLName", employeeLastName);
		model.addAttribute("requestParamBindingWayAge", employeeAge);
		String returnString = "requestParamBindingWaySuccess";
		logger.info("Exiting requestParamBindingWay()");
		return returnString;
	}
}
