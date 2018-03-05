package com.pskindero.dogtherapy.test.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

	protected WebDriver driver;
	
	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}