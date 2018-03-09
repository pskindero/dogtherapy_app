package com.pskindero.dogtherapy.test.model.homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pskindero.dogtherapy.test.model.PageFragment;

public class HomePageNavigation extends PageFragment {
	
	
	@FindBy(id="topNav")
	private WebElement topMenuElem;
	
	@FindBy(id="dogotherapyNav")
	private WebElement dogtherapyMenuElem;
	
	@FindBy(id="ourcopetencesNav")
	private WebElement ourcopetencesMenuElem;

	@FindBy(id="activitiesNav")
	private WebElement activitiesMenuElem;

	@FindBy(id="galleryNav")
	private WebElement galleryMenuElem;

	@FindBy(id="contactNav")
	private WebElement contactsMenuElem;
	
	public HomePageNavigation(WebDriver driver) {
		super(driver);
	}
	
	public void goToTopOfPage() {
		topMenuElem.click();
	}
	
	public void goToDogtherapyTab() {
		dogtherapyMenuElem.click();
	}
	
	public void goToCompetencesTab() {
		ourcopetencesMenuElem.click();
	}
	
	public void goToActiviesTab() {
		activitiesMenuElem.click();
	}
	
	public void goToGalleryTab() {
		galleryMenuElem.click();
	}
	
	public void goToContactsTab() {
		contactsMenuElem.click();
	}
}
