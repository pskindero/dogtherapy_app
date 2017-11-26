package com.pskindero.dogtherapy.jpa.repo;

import com.pskindero.dogtherapy.jpa.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long>{

}
