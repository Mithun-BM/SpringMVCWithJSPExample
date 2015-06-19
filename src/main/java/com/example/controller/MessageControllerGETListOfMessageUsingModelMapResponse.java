package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Message;


@Controller
public class MessageControllerGETListOfMessageUsingModelMapResponse 
{
	private static final Logger logger = LoggerFactory
			.getLogger(MessageControllerGETListOfMessageUsingModelMapResponse.class);
	
	
	@RequestMapping(value = "/getMessageListUsingModelMapFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel1stWay(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		logger.info("Entering getMsgUsingModel1stWay()");
		String message1 = "Message 1 ModelMap";
		String message2 = "Message 2 ModelMap";
		String message3 = "Message 3 ModelMap";
		List<String> msglist = new ArrayList<String>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		modelmap.addAttribute("messageList1ModelMap",msglist);
		logger.info("Exiting getMsgUsingModel1stWay()");
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageListUsingModelMapSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModel2ndWay(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		logger.info("Entering getMsgUsingModel2ndWay()");
		Message message1 = new Message();
		message1.setMessageId(1);
		message1.setMessageContent("Message Content From Message Obj1 ModelMap");
		message1.setMessageTime("16-03-2015");

		Message message2 = new Message();
		message2.setMessageId(2);
		message2.setMessageContent("Message Content From Message Obj2 ModelMap");
		message2.setMessageTime("16-03-2015");

		Message message3 = new Message();
		message3.setMessageId(3);
		message3.setMessageContent("Message Content From Message Obj3 ModelMap");
		message3.setMessageTime("16-03-2015");

		List<Message> msglist = new ArrayList<Message>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		modelmap.addAttribute("messageList2ModelMap",msglist);
		logger.info("Exiting getMsgUsingModel2ndWay()");
		return "messageDetails";
	}

	/*Code Backup 
	 @RequestMapping(value = "/getMessageListUsingModelMapFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel1stWay(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		String message1 = "Message 1 ModelMap";
		String message2 = "Message 2 ModelMap";
		String message3 = "Message 3 ModelMap";
		List<String> msglist = new ArrayList<String>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		modelmap.addAttribute("messageList1ModelMap",msglist);
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageListUsingModelMapSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModel2ndWay(ModelMap modelmap) //Response is set in modelmap attribute and get the message in JSP using JSTL tags
	{
		Message message1 = new Message();
		message1.setMesageId(1);
		message1.setMesageContent("Message Content From Message Obj1 ModelMap");
		message1.setMesageTime("16-03-2015");

		Message message2 = new Message();
		message2.setMesageId(2);
		message2.setMesageContent("Message Content From Message Obj2 ModelMap");
		message2.setMesageTime("16-03-2015");

		Message message3 = new Message();
		message3.setMesageId(3);
		message3.setMesageContent("Message Content From Message Obj3 ModelMap");
		message3.setMesageTime("16-03-2015");

		List<Message> msglist = new ArrayList<Message>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		modelmap.addAttribute("messageList2ModelMap",msglist);
		return "messageDetails";
	}*/
}