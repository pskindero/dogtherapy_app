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
	public void goToContactsTabTest() throws InterruptedException {
    	homePage.navigate().goToContactsTab();
    	
    	assertTrue("Cannot navigate to Contacts tab",
    			UiVisibleAreaHelper.isElementInVisibleArea(driver, 
    					homePage.getContactsTab().getPhoneElement()));
    	
	}
	
	@AfterClass
	public static void cleanup() {
		driver.quit();
	}
}
