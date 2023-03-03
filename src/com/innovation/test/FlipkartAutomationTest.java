package com.innovation.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.innovation.base.BaseLibrary;
import com.innovation.constants.FlipkartAutomationConstants;
import com.innovation.page.FlipkartAutomationPage;

public class FlipkartAutomationTest extends BaseLibrary {

	public FlipkartAutomationPage flipkartAutomationPage;

	@Test(priority = 0)
	public void lauchApplication() {
		lauchApplication(FlipkartAutomationConstants.BROWSER_TEXT_CHROME);
	}

	@Test(priority = 1)
	public void verifyAndClosePopUP() throws InterruptedException {
		flipkartAutomationPage = new FlipkartAutomationPage();
		Assert.assertTrue(
				flipkartAutomationPage.isLoginPopUpDisplayed(FlipkartAutomationConstants.EXPECTED_POPUP_TEXT_LOGIN),
				FlipkartAutomationConstants.ASSERTION_FAILED_TEXT);
		flipkartAutomationPage.closePopUp();
	}

	@Test(priority = 2)
	public void clickAndVerifyBanner() throws InterruptedException {
		Assert.assertTrue(flipkartAutomationPage.isBannerListDisplayed(),
				FlipkartAutomationConstants.ASSERTION_FAILED_TEXT);
		flipkartAutomationPage.clickOnBanner();
	}

	@Test(priority = 3)
	public void hoverElectronicsMenuAndPrintSubMenu() throws InterruptedException {
		Assert.assertTrue(
				flipkartAutomationPage.isElectronicsMenuDisplayed(FlipkartAutomationConstants.ELECTRONICS_MENU_TEXT),
				FlipkartAutomationConstants.ASSERTION_FAILED_TEXT);
		flipkartAutomationPage.mouseHoverOnElectronicsMenu();
		flipkartAutomationPage.printAllTheElectronicsSubMenu();
	}

}
