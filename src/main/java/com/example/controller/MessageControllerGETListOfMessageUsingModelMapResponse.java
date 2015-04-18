package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Message;


@Controller
@RequestMapping
public class MessageControllerGETListOfMessageUsingModelMapResponse 
{
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