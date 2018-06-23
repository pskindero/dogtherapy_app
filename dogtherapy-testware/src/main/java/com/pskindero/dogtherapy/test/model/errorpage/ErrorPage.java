package com.pskindero.dogtherapy.test.model.errorpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pskindero.dogtherapy.test.model.PageObject;
import com.pskindero.dogtherapy.test.utils.EndpointsDefinitions;

public class ErrorPage extends PageObject{

	private static final String URL_VIA_IP = EndpointsDefinitions.MAIN_PAGE_IP + "/error";

	@FindBy(id="error_msg")
	private WebElement errorMessageElem;

	@FindBy(id="home_page_ref")
	private WebElement homePageRefElem;
	
	public ErrorPage(WebDriver driver) {
		super(driver);
	}
	
	public void open() {
		driver.get(URL_VIA_IP);
	}
	
	public void open(String incorrectResource) {
		driver.get(URL_VIA_IP + incorrectResource);
	}

	public WebElement getErrorMessageElem() {
		return errorMessageElem;
	}

	public WebElement getHomePageRefElem() {
		return homePageRefElem;
	}
	
	public void goToMainPage() {
		homePageRefElem.click();
	}
}
