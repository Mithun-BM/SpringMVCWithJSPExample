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
import com.example.entity.MainForm;
import com.example.entity.Project;
import com.example.form.validator.EmployeeFormValidator;

@Controller
public class ExperimentEmployeeControllerPOSTFormData {

	private static final Logger logger = LoggerFactory
			.getLogger(ExperimentEmployeeControllerPOSTFormData.class);

	//First Way
	@RequestMapping(value = "/experimentemployee", method = RequestMethod.GET) 
	public ModelAndView showEmployeeLoginPage1stWay() { 
		logger.info("Inside showEmployeeLoginPage1stWay()");
		return new ModelAndView("experimentEmployeeLoginForm", "employee", new Employee());  
	}

	//OR

	/*//Second Way
		@ModelAttribute("employee")
		public Employee createEmployeeModel() 
		{
			logger.info("Inside createEmployeeModel()");
			return new Employee();
		}

		@RequestMapping(value="/experimentemployee", method = RequestMethod.GET)
		public String showEmployeeLoginPage2ndWay() 
		{
			logger.info("Inside showEmployeeLoginPage2ndWay()");
			return "experimentEmployeeLoginForm";
		}*/

	//OR

	/*//Third Way
		@RequestMapping(value = "/experimentemployee" , method = RequestMethod.GET)
		public String showEmployeeLoginPage3rdWay(Model model) {
			logger.info("Entering showEmployeeLoginPage3rdWay()");
			Employee employeeForm = new Employee();
			model.addAttribute("employee",employeeForm);
			logger.info("Exiting showEmployeeLoginPage3rdWay()");
			return "experimentEmployeeLoginForm";
		}*/

	/*@RequestMapping(value = "/postExperimentEmployeeFormData", method = RequestMethod.POST)
	public String postExperimentEmployeeFormData(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) 
	{
		logger.info("Entering postExperimentEmployeeFormData()");
		String returnString = "employeeLoginForm";
		new EmployeeFormValidator().validate(employee,result);//Doing server side validation using spring mvc form validation.
		if(!result.hasErrors()){
			model.addAttribute("employeeResponse", employee);
			logger.info("Exiting postExperimentEmployeeFormData()");
			returnString = "employeePostSuccessDetails"; 
		}
		return returnString;
	}*/


	//Session Usage example
	@RequestMapping(value = "/employeeSessionUsageExample", method = RequestMethod.POST)
	public String employeeSessionUsageExample(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) 
	{
		logger.info("Entering employeeSessionUsageExample()");
		String returnString = "experimentEmployeeLoginForm";
		new EmployeeFormValidator().validate(employee,result);//Doing server side validation using spring mvc form validation.
		if(!result.hasErrors()){
			model.addAttribute("employeeResponse", employee);
			//returnString = "sessionDataPostSuccessDetails";//getting Person data from session using @SessionAttributes. 
			//OR
			returnString = "sessionDataPostSuccessDetails";//getting Person data from session using session.setAttribute("personResponse", person);

		}
		logger.info("Exiting employeeSessionUsageExample()");
		return returnString;
	}

	//params usage example
	@RequestMapping(value = "/experimentparams", method = RequestMethod.GET) 
	public String experimentparamsGET(Model model) { 
		logger.info("Entering experimentparamsGET()");
		model.addAttribute("employee",new Employee());
		model.addAttribute("project",new Project());
		logger.info("Exiting experimentparamsGET()");
		return "experimentparamsLoginForm";  
	}

	@RequestMapping(value = "/experimentparams", method = RequestMethod.POST , params = {"employeeCode"})//params = {"employeeId"} 
	//params = {"employeeId"}  employeeId should be same as in experimentparamsLoginForm.jsp --> path="employeeId".
	public String experimentparamsMethod1(@ModelAttribute("employee") Employee employee, BindingResult result, Model model) 
	{
		logger.info("Entering experimentparamsMethod1()");
		String returnString = "experimentparamsLoginForm";
		new EmployeeFormValidator().validate(employee,result);//Doing server side validation using spring mvc form validation.
		if(!result.hasErrors()){
			model.addAttribute("employeeResponse", employee);
			returnString = "experimentEmployeePostSuccessDetails"; 
		}
		logger.info("Exiting experimentparamsMethod1()");
		return returnString;
	}

	@RequestMapping(value = "/experimentparams", method = RequestMethod.POST ,  params = {"projectCode"})//params = {"projectId"}
	//params = {"projectId"}  projectId should be same as in experimentparamsLoginForm.jsp --> path="projectId".
	public String experimentparamsMethod2(@ModelAttribute("project") Project project, BindingResult result, Model model) 
	{
		logger.info("Entering experimentparamsMethod2()");
		String returnString = "experimentparamsLoginForm";
		model.addAttribute("projectResponse", project);
		returnString = "experimentEmployeePostSuccessDetails"; 
		logger.info("Exiting experimentparamsMethod2()");
		return returnString;
	}
	
	//Multiple form usage example
	@RequestMapping(value = "/experimentforms", method = RequestMethod.GET) 
	public String experimentformsGET(Model model) { 
		logger.info("Entering experimentformsGET()");
		model.addAttribute("mainForm",new MainForm()); 
		model.addAttribute("employee",new Employee());
		model.addAttribute("project",new Project());
		logger.info("Exiting experimentformsGET()");
		return "experimentFormsLogin";  
	}
	
	@RequestMapping(value = "/experimentforms", method = RequestMethod.POST)
	public String experimentformsPOST(@ModelAttribute("mainForm") MainForm mainForm , @ModelAttribute("employee") Employee employee, @ModelAttribute("project") Project project, BindingResult result, Model model) 
	{
		logger.info("Entering experimentformsPOST()");
		String returnString = "experimentFormsLogin";
		new EmployeeFormValidator().validate(employee,result);//Doing server side validation using spring mvc form validation.
		if(!result.hasErrors()){
			model.addAttribute("employeeResponse", employee);
			returnString = "experimentEmployeePostSuccessDetails"; 
		}
		model.addAttribute("projectResponse", project);
		model.addAttribute("mainFormResponse", mainForm);
		logger.info("Exiting experimentformsPOST()");
		return returnString;
	}
}
