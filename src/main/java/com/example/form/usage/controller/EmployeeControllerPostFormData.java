package com.example.form.usage.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.entity.Employee;
import com.example.form.data.EmployeeForm;
import com.example.form.validator.EmployeeFormValidator;

@Controller
public class EmployeeControllerPostFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(EmployeeControllerPostFormData.class);

	/*//First Way
	@RequestMapping(value = "/employee", method = RequestMethod.GET) 
	public ModelAndView showEmployeeLoginPage2ndWay() { 
		logger.info("Inside showEmployeeLoginPage2ndWay()");
		return new ModelAndView("employeeLoginForm", "employee", new Employee());  
	}*/

	//OR

	/* //Second Way
	@ModelAttribute("employee")
	public Employee createEmployeeModel() 
	{
		logger.info("Inside createEmployeeModel()");
		return new Employee();
	}
	
	@RequestMapping(value="/employee", method = RequestMethod.GET)
	public String showEmployeeLoginPage1stWay() 
	{
		logger.info("Inside showEmployeeLoginPage1stWay()");
		return "employeeLoginForm";
	}*/

	//OR
	
	//Third Way
    @RequestMapping(value = "/employee" , method = RequestMethod.GET)
    public String showEmployeeLoginPage3rdWay(Model model) {
    	logger.info("Entering showEmployeeLoginPage3rdWay()");
        Employee employeeForm = new Employee();
        model.addAttribute("employee",employeeForm);
        logger.info("Exiting showEmployeeLoginPage3rdWay()");
        return "employeeLoginForm";
    }
    
	@RequestMapping(value = "/postEmployeeFormData", method = RequestMethod.POST)
	public String postEmployeeFormData(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) 
	{
		logger.info("Entering postEmployeeFormData()");
		String returnString = "employeeLoginForm";
		new EmployeeFormValidator().validate(employee,result);//Doing server side validation using spring mvc form validation.
		if(!result.hasErrors()){
			model.addAttribute("employeeResponse", employee);
			logger.info("Exiting postEmployeeFormData()");
			returnString = "employeePostSuccessDetails";
		}
		return returnString;
	}

}
