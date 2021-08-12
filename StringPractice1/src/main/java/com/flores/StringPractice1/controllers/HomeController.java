package com.flores.StringPractice1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
		@RequestMapping("/")
		private String index()
		{
			return "Hello Client How are you doing?";
		}
		@RequestMapping("/random")
		private String page2()
		{
			return "Spring boot is great! So easy to respond with Strings";
		}

}
