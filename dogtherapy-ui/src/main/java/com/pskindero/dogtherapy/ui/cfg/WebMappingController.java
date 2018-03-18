package com.pskindero.dogtherapy.ui.cfg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebMappingController {

	@RequestMapping(value = {"/"})
	public String homePage() {
		return "index";
	}
	
	@RequestMapping(value = {"/administrator"})
	public String adminPage() {
		return "admin";
	}
	
	@RequestMapping(value = {"/zaloguj"})
	public String loginPage() {
		return "login";
	}
}
