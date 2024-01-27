package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	
	@RequestMapping("/index")
	public String home() {
		return "index";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	
}

