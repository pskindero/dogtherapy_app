package com.pskindero.dogtherapy.dogtherapy_war.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pskindero.dogtherapy.jpa.model.Contact;
import com.pskindero.dogtherapy.jpa.repo.ContactRepository;

@RestController
public class ContactsResource {
	
	@Autowired 
	private ContactRepository contactRepository;

	@RequestMapping("/contact")
	public @ResponseBody Iterable<Contact> getContacts() {
		return contactRepository.findAll();
	}
	
//	@RequestMapping("/contact")
//	public @ResponseBody String getContacts() {
//		return "works";
//	}
}
