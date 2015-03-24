package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping
public class MessageControllerGETUsingModelResponse 
{

	@RequestMapping(value = "/getMessageUsingModelFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using Model Response 1st Way";
		model.addAttribute("message",responseMessage);
		return "messageDetails";
	}
	
	@RequestMapping(value = "/getMessageUsingModelSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModelSecondWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using Model Response 2nd Way";
		String responseMessageFrom = "Mithun";
		String responseMessageTime = "16-03-2015";
		model.addAttribute("message",responseMessage);
		model.addAttribute("messageFrom",responseMessageFrom);
		model.addAttribute("messageTime",responseMessageTime);
		return "messageDetails";
	}
}