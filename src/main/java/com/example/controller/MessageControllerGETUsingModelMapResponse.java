package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping
public class MessageControllerGETUsingModelMapResponse 
{

	@RequestMapping(value = "/getMessageUsingModelMap", method = RequestMethod.GET)
	public String getMsgUsingModel(ModelMap modelmap) //Response is set in  modelmap attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using Model Map Response";
		String responseMessageFrom = "Mithun";
		String responseMessageTime = "16-03-2015";
		modelmap.addAttribute("message",responseMessage);
		modelmap.addAttribute("messageFrom",responseMessageFrom);
		modelmap.addAttribute("messageTime",responseMessageTime);
		return "messageDetails";
	}
}