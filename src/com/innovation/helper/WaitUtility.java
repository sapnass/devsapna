package com.innovation.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.innovation.base.BaseLibrary;

public class WaitUtility extends BaseLibrary {

	/**
	 * Explicit Wait Until Visibility of Element
	 * 
	 * @param element
	 * @param time
	 */
	public void explicitWaitUntilVisibilityOfElement(WebElement element, long time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
