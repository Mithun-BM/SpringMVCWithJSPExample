package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Message;

@Controller
public class MessageControllerPOSTFormData 
{
	private static final Logger logger = LoggerFactory
			.getLogger(MessageControllerPOSTFormData.class);

	/*//Loading loginForm.jsp page's message Model using ModelAndView 1st way
	@RequestMapping(value = "/message", method = RequestMethod.GET) 
	public ModelAndView showMessageLoginPage1stWay() { 
	 	logger.info("Inside showMessageLoginPage1stWay()");
		return new ModelAndView("messageLoginForm.", "message", new Message()); //message - should match loginForm.jsp  modelAttribute="message" OR commandName="message" 
	}*/
	
	//OR
	
	//Loading loginForm.jsp page's message Model using createMessageModel 2nd way
	@ModelAttribute("message")// message - ModelAttribute value should be same as used in the loginForm.jsp
	public Message createMessageModel() {
		logger.info("Inside createMessageModel()");
		return new Message();
	}

	@RequestMapping(value="/message", method = RequestMethod.GET)
	public String showMessageLoginPage2ndWay() {
		logger.info("Inside showMessageLoginPage2ndWay()");
		return "messageLoginForm";
	}

	@RequestMapping(value = "/postMessageFormData", method = RequestMethod.POST)
	public String postMessageFormData(@ModelAttribute("message") Message message, BindingResult result , Model model)
	{//@ModelAttribute has to be immediately followed by BindingResult//BindingResult result is optional
		logger.info("Entering postMessageFormData()");
		String returnString="messageLoginForm.";
		//new MessageFormValidator().validate(message,result);
		if(!result.hasErrors()){
			model.addAttribute("messageResponse",message);
			logger.info("Exiting postMessageFormData()");
			returnString = "messagePostSuccessDetails";
		}
		return returnString;
	}

	/*Code Backup 
	 
	}*/
}