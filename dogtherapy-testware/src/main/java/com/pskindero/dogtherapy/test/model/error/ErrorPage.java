package com.pskindero.dogtherapy.test.model.error;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pskindero.dogtherapy.test.model.PageObject;

public class ErrorPage extends PageObject{

	@FindBy(id="error_msg")
	private WebElement errorMessageElem;

	@FindBy(id="home_page_ref")
	private WebElement homePageRefElem;
	
	public ErrorPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getErrorMessageElem() {
		return errorMessageElem;
	}

	public WebElement getHomePageRefElem() {
		return homePageRefElem;
	}
}
