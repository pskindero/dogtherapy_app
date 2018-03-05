package com.pskindero.dogtherapy.test.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageFragment {

	protected WebDriver driver;
	
	public PageFragment(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
