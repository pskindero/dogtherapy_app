package com.pskindero.dogtherapy.test.model.homepage;

import org.openqa.selenium.WebDriver;

import com.pskindero.dogtherapy.test.model.PageObject;
import com.pskindero.dogtherapy.test.utils.EndpointsDefinitions;

public class HomePage extends PageObject {
	
	private static final String URL_VIA_IP = EndpointsDefinitions.MAIN_PAGE_IP;
	public static final String TITLE_DEFAULT = "Dogoterapia z Fibi";
	
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
