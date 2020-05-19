package com.manishsoft.Glliter.controller.copy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Glitter {
	@Value("${message}")
	private String message;
	
	
	@GetMapping("/gliter")
	public String getGliter() {
		return message;

	}
}
