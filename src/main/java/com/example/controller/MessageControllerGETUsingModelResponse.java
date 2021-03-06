package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MessageControllerGETUsingModelResponse 
{

	private static final Logger logger = LoggerFactory
			.getLogger(MessageControllerGETUsingModelResponse.class);
	
	@RequestMapping(value = "/getMessageUsingModelFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		logger.info("Entering getMsgUsingModel()");
		String responseMessage = "Hello World Using Model Response 1st Way";
		model.addAttribute("messageModel",responseMessage);
		logger.info("Exiting getMsgUsingModel()");
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageUsingModelSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModelSecondWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		logger.info("Entering getMsgUsingModelSecondWay()");
		String responseMessage = "Hello World Using Model Response 2nd Way";
		String responseMessageFrom = "Mithun";
		String responseMessageTime = "16-03-2015";
		model.addAttribute("messageModel",responseMessage);
		model.addAttribute("messageFromModel",responseMessageFrom);
		model.addAttribute("messageTimeModel",responseMessageTime);
		logger.info("Exiting getMsgUsingModelSecondWay()");
		return "messageDetails";
	}

	/*Code Backup 
	 @RequestMapping(value = "/getMessageUsingModelFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using Model Response 1st Way";
		model.addAttribute("messageModel",responseMessage);
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageUsingModelSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModelSecondWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using Model Response 2nd Way";
		String responseMessageFrom = "Mithun";
		String responseMessageTime = "16-03-2015";
		model.addAttribute("messageModel",responseMessage);
		model.addAttribute("messageFromModel",responseMessageFrom);
		model.addAttribute("messageTimeModel",responseMessageTime);
		return "messageDetails";
	}*/
}