package com.pskindero.dogtherapy.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pskindero.dogtherapy.jpa.model.Contact;
import com.pskindero.dogtherapy.jpa.repo.ContactRepository;

//TODO to remove, only for development purpose
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ContactRepository repo = SpringApplication.run(Application.class, args).getBean(ContactRepository.class);
		
		Contact contact = repo.findOne(1L);
		System.out.println("Contact found with findOne(1L):");
		System.out.println("--------------------------------");
		System.out.println(contact.toString());
		System.out.println("");
	}
}