package com.pskindero.dogtherapy.jpa.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.pskindero.dogtherapy.jpa.model.Contact;

@Component
public interface ContactRepository extends CrudRepository<Contact, Long>{

}
