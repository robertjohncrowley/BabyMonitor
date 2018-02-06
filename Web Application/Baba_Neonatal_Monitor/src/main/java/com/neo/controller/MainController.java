package com.neo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
}
