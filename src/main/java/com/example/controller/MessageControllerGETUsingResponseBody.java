package com.example.controller;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping
public class MessageControllerGETUsingResponseBody 
{

	@RequestMapping(value = "/getMessageUsingResponseBody", method = RequestMethod.GET)
	@ResponseBody//Response is sent using @ResponseBody 
	public String getMsgUsingModel() throws JsonGenerationException, JsonMappingException, IOException 
	{
		String responseMessage = "Hello World";
		return new ObjectMapper().writeValueAsString(responseMessage);
	}
}