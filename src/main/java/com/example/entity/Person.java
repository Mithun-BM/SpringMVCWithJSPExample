package com.example.entity;

import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class Person {

	@NotNull(message = "NotNull.fname")//Or 
	private String fname;

	@NotBlank(message = "NotBlank.mname")//Validate that the annotated string is not null or empty.
	private String mname;

	@Size(min=3 , max=10 , message="Size.lname") //Or Size.lname
	private String lname;

	@NotEmpty(message = "NotEmpty.email")//Asserts that the annotated string, collection, map or array is not null or empty.
	@Email(message = "Email.email")//Or 
	private String email;

	@Range(min = 18, max = 60 , message = "Range.age")//The annotated element has to be in the appropriate range.
	private Integer age;

	@Min(value = 1, message = "Min.car")
	@Max(value = 3 , message = "Max.car")
	private Integer car;

	/*@Length(min=10 , max=10 , message = "Length.phoneNumber")//Or Size.phoneNumber
	@Pattern(regexp="(^$|[0-9]{10})")
	private String phoneNumber;*/

	@Size(min=10 , max=10 , message = "Size.phoneNumber")//Or Length.phoneNumber
	//@Digits(integer=1, fraction = 0)
	private String phoneNumber;

	@Length(min=1 , message = "Length.minLengthCheck")//Length works only on String
	private String minLengthCheck;
	
	@Length(max=3 , message = "Length.maxLengthCheck")//Or 
	private String maxLengthCheck;
	
	/*@DateTimeFormat(pattern="MM/dd/yyyy")
	@Past()
	@Future()
    @NotNull 
    private Date dob;*/

	
	public String getMinLengthCheck() {
		return minLengthCheck;
	}

	public void setMinLengthCheck(String minLengthCheck) {
		this.minLengthCheck = minLengthCheck;
	}

	public String getMaxLengthCheck() {
		return maxLengthCheck;
	}

	public void setMaxLengthCheck(String maxLengthCheck) {
		this.maxLengthCheck = maxLengthCheck;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}*/
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Integer getCar() {
		return car;
	}

	public void setCar(Integer car) {
		this.car = car;
	}
}
