package com.pskindero.dogtherapy.test.testcase.ui;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pskindero.dogtherapy.test.model.homepage.HomePage;
import com.pskindero.dogtherapy.test.utils.UiVisibleAreaHelper;

public class HomePageNavigationTest {
	
	private static WebDriver driver;
	private static HomePage homePage;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
    	homePage = new HomePage(driver);
    	
    	homePage.open();
	}
	
	@Test
	public void goToHeaderTabTest() throws InterruptedException {
    	homePage.navigate().goToTopOfPage();
    	
    	assertTrue(
    			UiVisibleAreaHelper.isElementInVisibleArea(driver, 
    					homePage.getHeaderTab().getMoreDogtherapyBtnElement()));
    	
    	assertTrue(homePage.getHeaderTab().getHomeHeadingElement().isDisplayed());
    	assertTrue(homePage.getHeaderTab().getHomeSentenceElement().isDisplayed());
    	assertTrue(homePage.getHeaderTab().getMoreDogtherapyBtnElement().isDisplayed());
	}
	
	@Test
	public void goToContactsTabTest() throws InterruptedException {
    	homePage.navigate().goToContactsTab();
    	
    	assertTrue(
    			UiVisibleAreaHelper.isElementInVisibleArea(driver, 
    					homePage.getContactsTab().getPhoneElement()));
    	
    	assertTrue(homePage.getContactsTab().getFbProfileElement().isDisplayed());
    	assertTrue(homePage.getContactsTab().getMailElement().isDisplayed());
    	assertTrue(homePage.getContactsTab().getFbProfileElement().isDisplayed());
    	
    	homePage.navigate().goToTopOfPage();
	}
	
	@AfterClass
	public static void cleanup() {
		driver.quit();
	}
}
