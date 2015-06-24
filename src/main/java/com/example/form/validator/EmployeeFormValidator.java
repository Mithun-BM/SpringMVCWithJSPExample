package com.example.form.validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.entity.Employee;
import com.example.form.data.EmployeeForm;

//All validations can be done inside this class
public class EmployeeFormValidator implements Validator {

	public boolean supports(Class<?> arg0) {
		return EmployeeForm.class.equals(arg0);
	}

	private static final Logger logger = LoggerFactory.getLogger(EmployeeFormValidator.class);

	
	public void validate(Object o, Errors arg1) {
		logger.info("###################  Inside EmployeeFormValidator --> validate() #############################");
		if (o instanceof Employee) {
			Employee form = (Employee) o;
			
			//1st Way of validation
			/*ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "employeeId", "valid.employee.Id");//employeeId field has to match Employee class field.
			ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "employeeFirstName", "valid.employee.firstName");//employeeFirstName field has to match Employee class field.
			ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "employeeLastName", "valid.employee.lastName");//employeeLastName field has to match Employee class field.
			ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "employeeAge", "valid.employee.Age");//employeeAge field has to match Employee class field.
			ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "employeeDOB", "valid.employee.DOB");//employeeDOB field has to match Employee class field.
			ValidationUtils.rejectIfEmptyOrWhitespace(arg1, "employeeEmail", "valid.employee.Email");//employeeEmail field has to match Employee class field.
*/			
			//2nd Way of validation
			 if (StringUtils.isEmpty(form.getEmployeeId())) {
				logger.info("################### EmployeeId is Empty #############################");
				//arg1.reject("valid.employee.Id"); //Brainstorm on this.
				//arg1.reject("employeeId", "valid.employee.Id"); //Brainstorm on this.
				arg1.rejectValue("employeeId", "valid.employee.Id");//employeeId field has to match Employee class field.	
			}
			 else if (StringUtils.isEmpty(form.getEmployeeFirstName())) {
				logger.info("###################  EmpFirstName is Empty #############################");
				//arg1.reject("valid.employee.firstName");
				arg1.rejectValue("employeeFirstName", "valid.employee.firstName");//employeeFirstName field has to match Employee class field.

			} else if (StringUtils.isEmpty(form.getEmployeeLastName())) {
				logger.info("################### EmpLastName is Empty #############################");
				//arg1.reject("valid.employee.lastName");
				arg1.rejectValue("employeeLastName", "valid.employee.lastName");//employeeLastName field has to match Employee class field.
			} 
			else if (StringUtils.isEmpty(form.getEmployeeAge())) {
				logger.info("################### EmployeeAge is Empty #############################");
				//arg1.reject("valid.employee.Age");
				arg1.rejectValue("employeeAge", "valid.employee.Age");//employeeAge field has to match Employee class field.
			}
			else if (StringUtils.isEmpty(form.getEmployeeDOB())) {
				logger.info("################### EmployeeDOB is Empty #############################");
				//arg1.reject("valid.employee.DOB");
				arg1.rejectValue("employeeDOB", "valid.employee.DOB");//employeeDOB field has to match Employee class field.
			}
			else if (StringUtils.isEmpty(form.getEmployeeEmail())) {
				logger.info("################### EmployeeEmail is Empty #############################");
				//arg1.reject("valid.employee.Email");
				arg1.rejectValue("employeeEmail", "valid.employee.Email");//employeeEmail field has to match Employee class field.
			}
			logger.info("###################  Exiting EmployeeFormValidator --> validate() #############################");
		}
	}
}
