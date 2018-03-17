package com.pskindero.dogtherapy.test.utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UiVisibleAreaHelper {

	public static boolean isElementInVisibleArea(WebDriver driver, WebElement element) {
		Dimension windowDimension = driver.manage().window().getSize();
		
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	long yPos = (Long) executor.executeScript("return window.pageYOffset;");
    	
    	Point p = element.getLocation();
    	return p.y >= yPos && p.y < yPos + windowDimension.height;
	}
}
