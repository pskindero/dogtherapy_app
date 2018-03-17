package com.pskindero.dogtherapy.test.model.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pskindero.dogtherapy.test.model.PageObject;

public class HeaderTab extends PageObject{

	@FindBy(id="homeHeading")
	private WebElement homeHeadingElement;
	
	@FindBy(id="homeSentence")
	private WebElement homeSentenceElement;
	
	@FindBy(id="moreDogtherapyBtn")
	private WebElement moreDogtherapyBtnElement;
	
	public HeaderTab(WebDriver driver) {
		super(driver);
	}

	public WebElement getHomeHeadingElement() {
		return homeHeadingElement;
	}

	public WebElement getHomeSentenceElement() {
		return homeSentenceElement;
	}

	public WebElement getMoreDogtherapyBtnElement() {
		return moreDogtherapyBtnElement;
	}
}
