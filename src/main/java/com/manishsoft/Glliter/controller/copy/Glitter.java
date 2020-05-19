package com.manishsoft.Glliter.controller.copy;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Glitter {
	@Value("Static Value")
	private String msg1;
	@Value("${message:Welcome to default value}")
	private String message;
	@Value("${listMessage}")
	private List<String> msg;
	@Value("#{${mapvalue}}")
	private Map<String, String> dbvalue;
	
	
	@GetMapping("/gliter")
	public String getGliter() {
		dbvalue.get("connection");
		System.out.println("======"+dbvalue.get("connection"));
		return message+"-----"+msg+"-----"+msg1+"----"+dbvalue;
		

	}
}
