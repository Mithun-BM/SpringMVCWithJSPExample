package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping
public class MessageControllerGETUsingModelMapResponse 
{

	@RequestMapping(value = "/getMessageUsingModelMapFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using ModelMap Response 1st Way";
		modelmap.addAttribute("messageModelMap",responseMessage);
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageUsingModelMapSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModelSecondWay(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using ModelMap Response 2nd Way";
		String responseMessageFrom = "Mithun";
		String responseMessageTime = "16-03-2015";
		modelmap.addAttribute("messageModelMap",responseMessage);
		modelmap.addAttribute("messageFromModelMap",responseMessageFrom);
		modelmap.addAttribute("messageTimeModelMap",responseMessageTime);
		return "messageDetails";
	}

	/*Code Backup 
	 @RequestMapping(value = "/getMessageUsingModelMapFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using ModelMap Response 1st Way";
		modelmap.addAttribute("messageModelMap",responseMessage);
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageUsingModelMapSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModelSecondWay(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		String responseMessage = "Hello World Using ModelMap Response 2nd Way";
		String responseMessageFrom = "Mithun";
		String responseMessageTime = "16-03-2015";
		modelmap.addAttribute("messageModelMap",responseMessage);
		modelmap.addAttribute("messageFromModelMap",responseMessageFrom);
		modelmap.addAttribute("messageTimeModelMap",responseMessageTime);
		return "messageDetails";
	}*/
}