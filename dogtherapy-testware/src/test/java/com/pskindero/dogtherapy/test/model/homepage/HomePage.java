package com.pskindero.dogtherapy.test.model.homepage;

import org.openqa.selenium.WebDriver;

import com.pskindero.dogtherapy.test.model.PageObject;

public class HomePage extends PageObject {
	
	private static final String URL_VIA_IP = "http://172.168.0.100:8443";
	
	private HomePageNavigation navigation;
	private HeaderTab headerTab;
	private ContactsTab contactsTab;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.navigation = new HomePageNavigation(driver);
		this.headerTab = new HeaderTab(driver);
		this.contactsTab = new ContactsTab(driver);
	}
	
	public void open() {
		driver.get(URL_VIA_IP);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public HomePageNavigation navigate() {
		return navigation;
	}
	
	public HeaderTab getHeaderTab() {
		return headerTab;
	}
	
	public ContactsTab getContactsTab() {
		return contactsTab;
	}
}
