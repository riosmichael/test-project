package com.test.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

	@RequestMapping("/")
	String home() {
		System.out.println("Start of home method...");
		System.out.println("Added new line to print...Conflict check...");
		return "Hello World!";
	}


}
