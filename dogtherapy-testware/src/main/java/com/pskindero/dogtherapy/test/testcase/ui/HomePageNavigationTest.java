package com.pskindero.dogtherapy.test.testcase.ui;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pskindero.dogtherapy.test.model.homepage.HeaderTab;
import com.pskindero.dogtherapy.test.model.homepage.HomePage;
import com.pskindero.dogtherapy.test.utils.UiVisibleAreaHelper;

public class HomePageNavigationTest {
	
	private static WebDriver driver;
	private static HomePage homePage;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       
    	homePage = new HomePage(driver);
    	homePage.open();
	}
	
	@Test
	public void goToHeaderTabTest() throws InterruptedException {
    	homePage.navigate().goToTopOfPage();
    	HeaderTab headerTab = new HeaderTab(driver);
    	
    	assertTrue(
    			UiVisibleAreaHelper.isElementInVisibleArea(driver, 
    					homePage.getHeaderTab().getMoreDogtherapyBtnElement()));
    	
    	assertTrue(headerTab.getHomeHeadingElement().isDisplayed());
    	assertTrue(headerTab.getHomeSentenceElement().isDisplayed());
    	assertTrue(headerTab.getMoreDogtherapyBtnElement().isDisplayed());
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
