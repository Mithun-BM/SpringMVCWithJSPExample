package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Message;



@Controller
@RequestMapping
public class MessageControllerPOSTFormData 
{
	private static final Logger logger = LoggerFactory
			.getLogger(MessageControllerPOSTFormData.class);
	
	/*//Loading LoginFormData.jsp page's message Model using ModelAndView 1st way
	@RequestMapping(value = "/message", method = RequestMethod.GET) 
	public ModelAndView message() {  
		return new ModelAndView("LoginFormData", "message", new Message()); //message - should match LoginFormData.jsp  modelAttribute="message" OR commandName="message" 
	}*/
														//OR
	//Loading LoginFormData.jsp page's message Model using createMessageModel 2nd way
	@ModelAttribute("message")// message - ModelAttribute value should be same as used in the LoginFormData.jsp
	public Message createMessageModel() {
		return new Message();
	}

	@RequestMapping(value="/message", method = RequestMethod.GET)
	public String showMessagePage() {
		return "LoginFormData";
	}
	
	@RequestMapping(value = "/postFormData", method = RequestMethod.POST)
	public String postFormData(@ModelAttribute("message") Message message, BindingResult result , ModelMap model)
	{//@ModelAttribute has to be immediately followed by BindingResult//BindingResult result is optional
		logger.info("Inside postFormData()");
		if(result.hasErrors()){
			return "error";
		}
		if(message == null){
			return "error";
		}
		System.out.println("Message id"+message.getMesageId());
		System.out.println("Message content"+message.getMesageContent());
		System.out.println("Message time"+message.getMesageTime());
		model.addAttribute("responseMessage",message);
		logger.info("Exiting postFormData()");
		return "messagePostSuccessDetails";
	}
	
	/*Code Backup 
	  private static final Logger logger = LoggerFactory
			.getLogger(MessageControllerPOSTFormData.class);
	
	//Loading LoginFormData.jsp page's message Model using ModelAndView 1st way
	@RequestMapping(value = "/message", method = RequestMethod.GET) 
	public ModelAndView message() {  
		return new ModelAndView("LoginFormData", "message", new Message()); //message - should match LoginFormData.jsp  modelAttribute="message" OR commandName="message" 
	}
														//OR
	//Loading LoginFormData.jsp page's message Model using createMessageModel 2nd way
	@ModelAttribute("message")// message - ModelAttribute value should be same as used in the LoginFormData.jsp
	public Message createMessageModel() {
		return new Message();
	}

	@RequestMapping(value="/message", method = RequestMethod.GET)
	public String showMessagePage() {
		return "LoginFormData";
	}
	
	@RequestMapping(value = "/postFormData", method = RequestMethod.POST)
	public String postFormData(@ModelAttribute("message") Message message, BindingResult result , ModelMap model)
	{//@ModelAttribute has to be immediately followed by BindingResult//BindingResult result is optional
		logger.info("Inside postFormData()");
		if(result.hasErrors()){
			return "error";
		}
		if(message == null){
			return "error";
		}
		System.out.println("Message id"+message.getMesageId());
		System.out.println("Message content"+message.getMesageContent());
		System.out.println("Message time"+message.getMesageTime());
		model.addAttribute("responseMessage",message);
		logger.info("Exiting postFormData()");
		return "messagePostSuccessDetails";
	}*/
}