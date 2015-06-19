package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Message;


@Controller
public class MessageControllerGETListOfMessageUsingModelResponse 
{

	private static final Logger logger = LoggerFactory
			.getLogger(MessageControllerGETListOfMessageUsingModelResponse.class);
	
	@RequestMapping(value = "/getMessageListUsingModelFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel1stWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		logger.info("Entering getMsgUsingModel1stWay()");
		String message1 = "Message 1 Model";
		String message2 = "Message 2 Model";
		String message3 = "Message 3 Model";
		List<String> msglist = new ArrayList<String>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		model.addAttribute("messageList1Model",msglist);
		logger.info("Exiting getMsgUsingModel1stWay()");
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageListUsingModelSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModel2ndWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		logger.info("Entering getMsgUsingModel2ndWay()");
		Message message1 = new Message();
		message1.setMessageId(1);
		message1.setMessageContent("Message Content From Message Obj1 Model");
		message1.setMessageTime("16-03-2015");

		Message message2 = new Message();
		message2.setMessageId(2);
		message2.setMessageContent("Message Content From Message Obj2 Model");
		message2.setMessageTime("16-03-2015");

		Message message3 = new Message();
		message3.setMessageId(3);
		message3.setMessageContent("Message Content From Message Obj3 Model");
		message3.setMessageTime("16-03-2015");

		List<Message> msglist = new ArrayList<Message>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		model.addAttribute("messageList2Model",msglist);
		logger.info("Exiting getMsgUsingModel2ndWay()");
		return "messageDetails";
	}

	/*Code Backup 
	 @RequestMapping(value = "/getMessageListUsingModelFirstWay", method = RequestMethod.GET)
	public String getMsgUsingModel1stWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		String message1 = "Message 1 Model";
		String message2 = "Message 2 Model";
		String message3 = "Message 3 Model";
		List<String> msglist = new ArrayList<String>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		model.addAttribute("messageList1Model",msglist);
		return "messageDetails";
	}

	@RequestMapping(value = "/getMessageListUsingModelSecondWay", method = RequestMethod.GET)
	public String getMsgUsingModel2ndWay(Model model) //Response is set in  model attribute and get the message in JSP using JSTL tags
	{
		Message message1 = new Message();
		message1.setMesageId(1);
		message1.setMesageContent("Message Content From Message Obj1 Model");
		message1.setMesageTime("16-03-2015");

		Message message2 = new Message();
		message2.setMesageId(2);
		message2.setMesageContent("Message Content From Message Obj2 Model");
		message2.setMesageTime("16-03-2015");

		Message message3 = new Message();
		message3.setMesageId(3);
		message3.setMesageContent("Message Content From Message Obj3 Model");
		message3.setMesageTime("16-03-2015");

		List<Message> msglist = new ArrayList<Message>();
		msglist.add(message1);
		msglist.add(message2);
		msglist.add(message3);
		model.addAttribute("messageList2Model",msglist);
		return "messageDetails";
	}*/
}