package com.pskindero.dogtherapy.dogtherapy_ui.cfg;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class DbConfiguration extends WebMvcConfigurerAdapter{

	@Bean(name = "dataSource")
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("org.postgresql.Driver");
		dataSourceBuilder.url("jdbc:postgresql://172.168.0.102:5432/dogtherapy_db");
		dataSourceBuilder.username("admin");
		dataSourceBuilder.password("admin");
		return dataSourceBuilder.build();
	}

}