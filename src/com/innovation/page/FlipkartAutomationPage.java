package com.innovation.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.innovation.base.BaseLibrary;
import com.innovation.constants.FlipkartAutomationConstants;
import com.innovation.helper.WaitUtility;

public class FlipkartAutomationPage extends BaseLibrary {

	// Class Level Variables.
	public boolean isVerify;
	public WaitUtility wait = new WaitUtility();

	// xpath variables
//	private static WebElement popUpLoginText = driver
//			.findElement(By.xpath(FlipkartAutomationConstants.POPUP_LOGIN_TEXT));
//	private static WebElement popUpCrossButton = driver
//			.findElement(By.xpath(FlipkartAutomationConstants.POPUP_CROSS_BUTTON));
//	private static WebElement bannerArrowButton = driver
//			.findElement(By.xpath(FlipkartAutomationConstants.BANNER_ARROW_BUTTON));
//	private static WebElement banner = driver.findElement(By.xpath(FlipkartAutomationConstants.BANNER));
//	private static WebElement electronicsMenu = driver
//			.findElement(By.xpath(FlipkartAutomationConstants.ELECTRONICS_MENU));
//	private static List<WebElement> electronicsSubMenuList = driver
//			.findElements(By.xpath(FlipkartAutomationConstants.ELECTONICS_SUBMENU_LIST));
//	private static List<WebElement> bannerList = driver.findElements(By.xpath(FlipkartAutomationConstants.BANNER_LIST));

	/**
	 * Constructor To Initialize the PageFactory
	 */
	public FlipkartAutomationPage() {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Verify If Login PopUp Displayed
	 * 
	 * @param expectedPopUpText
	 * @return
	 * @throws InterruptedException 
	 */
	public boolean isLoginPopUpDisplayed(String expectedPopUpText) throws InterruptedException {
		Thread.sleep(2000);
		String actualPopUpText = driver.findElement(By.xpath(FlipkartAutomationConstants.POPUP_LOGIN_TEXT)).getText();
		isVerify = actualPopUpText.equals(expectedPopUpText);
		return isVerify;
	}

	/**
	 * Click On PopUp Cross Button
	 * @throws InterruptedException 
	 */
	public void closePopUp() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(FlipkartAutomationConstants.POPUP_CROSS_BUTTON)).click();
	}

	/**
	 * Verify If Banner List Displayed
	 * 
	 * @throws InterruptedException
	 */
	public boolean isBannerListDisplayed() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		isVerify = driver.findElement(By.xpath(FlipkartAutomationConstants.BANNER)).isDisplayed();
		action.moveToElement(driver.findElement(By.xpath(FlipkartAutomationConstants.BANNER_ARROW_BUTTON))).click()
				.build().perform();
		List<WebElement> bannerList = driver.findElements(By.xpath(FlipkartAutomationConstants.BANNER_LIST));
		Thread.sleep(2000);
		for (WebElement banner : bannerList) {
			wait.explicitWaitUntilVisibilityOfElement(banner, FlipkartAutomationConstants.THIRTY_SECONDS);
		}
		return isVerify;
	}

	/**
	 * Click On Banner
	 * @throws InterruptedException 
	 */
	public void clickOnBanner() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(FlipkartAutomationConstants.BANNER)).click();
	}

	/**
	 * Verify if Electronics Menu Displayed
	 * 
	 * @param expectedElectronicsMenuText
	 * @return
	 * @throws InterruptedException 
	 */
	public boolean isElectronicsMenuDisplayed(String expectedElectronicsMenuText) throws InterruptedException {
		Thread.sleep(2000);
		String actualElectronicsMenuText = driver.findElement(By.xpath(FlipkartAutomationConstants.ELECTRONICS_MENU)).getText();
		isVerify = actualElectronicsMenuText.equals(expectedElectronicsMenuText);
		return isVerify;
	}
	
	/**
	 * Mouse Hover on the Electronics Menu
	 * 
	 * @throws InterruptedException
	 */
	public void mouseHoverOnElectronicsMenu() throws InterruptedException {
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.xpath(FlipkartAutomationConstants.ELECTRONICS_MENU))).build()
				.perform();
	}

	/**
	 * Print All the Electronics SubMenu List
	 */
	public void printAllTheElectronicsSubMenu() {
		int i = 1;
		System.out.println("----------------------------");
		for (WebElement electronicsSubMenu : driver
				.findElements(By.xpath(FlipkartAutomationConstants.ELECTONICS_SUBMENU_LIST))) {
			if (electronicsSubMenu.getText().equals(FlipkartAutomationConstants.MOBILE_TEXT)) {
				continue;
			} else {
				System.out.println(i + ". " + electronicsSubMenu.getText());
				i++;
			}
		}
		System.out.println("----------------------------\n");
	}
}
