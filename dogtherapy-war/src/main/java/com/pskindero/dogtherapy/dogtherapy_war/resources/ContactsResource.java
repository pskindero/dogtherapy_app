package com.pskindero.dogtherapy.dogtherapy_war.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsResource {


	@RequestMapping("/contact")
	public String getContacts() {
		return "First Impl";
	}
}
