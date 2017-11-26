package com.pskindero.dogtherapy.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

public class AppConfig {

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
	     LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
	    factoryBean.setPersistenceUnitName("com.pskindero.dogtherapy.jpa");
	    return factoryBean;
	}
}
