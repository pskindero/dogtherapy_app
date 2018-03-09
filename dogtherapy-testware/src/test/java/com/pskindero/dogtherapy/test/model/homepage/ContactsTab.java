package com.pskindero.dogtherapy.test.model.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pskindero.dogtherapy.test.model.PageFragment;

public class ContactsTab extends PageFragment {

	@FindBy(id="slogan")
	private WebElement sloganElement;
	
	@FindBy(id="phone")
	private WebElement phoneElement;
	
	@FindBy(id="mail")
	private WebElement mailElement;
	
	@FindBy(id="fb_profile")
	private WebElement fbProfileElement;
	
	public ContactsTab(WebDriver driver) {
		super(driver);
	}

	public WebElement getSloganElement() {
		return sloganElement;
	}

	public WebElement getPhoneElement() {
		return phoneElement;
	}

	public WebElement getMailElement() {
		return mailElement;
	}

	public WebElement getFbProfileElement() {
		return fbProfileElement;
	}

}
