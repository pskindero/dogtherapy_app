package com.pskindero.dogtherapy.test.testcase.ui;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pskindero.dogtherapy.test.model.errorpage.ErrorPage;
import com.pskindero.dogtherapy.test.model.homepage.HomePage;

public class ErrorPageTest {

	private static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void openErrorUrlTest() {
		ErrorPage errorPage = new ErrorPage(driver);
		errorPage.open();
		
		assertTrue(errorPage.getErrorMessageElem().isDisplayed());
		assertTrue(errorPage.getHomePageRefElem().isDisplayed());
	}
	
	@Test
	public void openIncorrectUrlTest() {
		ErrorPage errorPage = new ErrorPage(driver);
		errorPage.open("/notexisting");
		
		assertTrue(errorPage.getErrorMessageElem().isDisplayed());
		assertTrue(errorPage.getHomePageRefElem().isDisplayed());
	}
	
	@Test
	public void openErrorUrlAndNavigateToMainPageTest() {
		ErrorPage errorPage = new ErrorPage(driver);
		errorPage.open();
		
		assertTrue(errorPage.getErrorMessageElem().isDisplayed());
		assertTrue(errorPage.getHomePageRefElem().isDisplayed());
		
		errorPage.goToMainPage();
		HomePage homePage = new HomePage(driver);
		assertEquals(HomePage.TITLE_DEFAULT, homePage.getTitle());
	}

	@AfterClass
	public static void cleanup() {
		driver.quit();
	}
}
