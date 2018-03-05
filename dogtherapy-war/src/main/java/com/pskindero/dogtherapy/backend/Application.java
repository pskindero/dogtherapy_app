package com.pskindero.dogtherapy.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.pskindero.dogtherapy.jpa", "com.pskindero.dogtherapy.backend"})
@EnableJpaRepositories(basePackages = {"com.pskindero.dogtherapy.jpa.repo"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//		ContactRepository repo = SpringApplication.run(Application.class, args).getBean(ContactRepository.class);		
//		Contact contact = repo.findOne(1L);
//		System.out.println("Contact found with findOne(1L):");
//		System.out.println("--------------------------------");
//		System.out.println(contact.toString());
//		System.out.println("");
    }
}
