package com.example.form.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;

import com.example.entity.Employee;
import com.example.form.data.EmployeeForm;

//All validations can be done inside this class
public class EmployeeFormValidator{

	public boolean supports(Class<?> arg0) {
		return EmployeeForm.class.equals(arg0);
	}

	private static final Logger logger = LoggerFactory.getLogger(EmployeeFormValidator.class);

	public void validate(Object o, Errors arg1) {
		logger.info("###################  Inside EmployeeFormValidator --> validate() #############################");
		if (o instanceof Employee) {
			Employee form = (Employee) o;
			if (StringUtils.isEmpty(form.getEmployeeFirstName())) {
				logger.info("###################  EmpFirstName is Empty #############################");
				arg1.reject("Please enter EmployeeFirstName");
			} else if (StringUtils.isEmpty(form.getEmployeeLastName())) {
				logger.info("################### EmpLastName is Empty #############################");
				arg1.reject("Please enter EmployeeLastName");
			} 
			else if (StringUtils.isEmpty(form.getEmployeeDOB())) {
				logger.info("################### EmployeeDOB is Empty #############################");
				arg1.reject("Please enter EmployeeDOB");
			}
			else if (StringUtils.isEmpty(form.getEmployeeId())) {
				logger.info("################### EmployeeId is Empty #############################");
				arg1.reject("Please enter EmployeeId");
			}
			else if (StringUtils.isEmpty(form.getEmployeeEmail())) {
				logger.info("################### EmployeeEmail is Empty #############################");
				arg1.reject("Please enter EmployeeEmail");
			}
			else if (StringUtils.isEmpty(form.getEmployeeAge())) {
				logger.info("################### EmployeeAge is Empty #############################");
				arg1.reject("Please enter EmployeeAge");
			}
			logger.info("###################  Exiting EmployeeFormValidator --> validate() #############################");
		}
	}
}
