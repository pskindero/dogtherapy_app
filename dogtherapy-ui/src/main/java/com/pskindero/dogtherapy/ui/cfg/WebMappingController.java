package com.pskindero.dogtherapy.ui.cfg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebMappingController {

	@RequestMapping(value = {"/"})
	public String homePage() {
		return "index.html";
	}
	
	@RequestMapping(value = {"/administrator"})
	public String adminPage() {
		return "admin.html";
	}
	
	@RequestMapping(value = {"/zaloguj"})
	public String loginPage() {
		return "login.html";
	}
}
