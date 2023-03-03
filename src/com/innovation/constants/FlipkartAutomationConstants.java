package com.innovation.constants;

public class FlipkartAutomationConstants {

	// Xpath Constants
	public static final String POPUP_LOGIN_TEXT = "//*[@class='_36KMOx']/span";
	public static final String POPUP_CROSS_BUTTON = "//*[@class='_2KpZ6l _2doB4z']";
	public static final String BANNER = "//a[@class='_2a3TMW' and contains(@href,'bannerads_2_2')]/div";
	public static final String BANNER_LIST = "//a[@class='_2a3TMW']/div";
	public static final String BANNER_ARROW_BUTTON = "//*[@class='_2t2dSp']";
	public static final String ELECTRONICS_MENU = "//*[text()='Electronics' and @class='_2I9KP_']";
	public static final String ELECTONICS_SUBMENU_LIST = "//div[@class='_1fwVde'][1]//child::a";

	// Test Data Constants
	public static final String EXPECTED_POPUP_TEXT_LOGIN = "Login";
	public static final String ASSERTION_FAILED_TEXT = "Assertion fails";
	public static final String BROWSER_TEXT_CHROME = "chrome";
	public static final String MOBILE_TEXT = "Mobiles";
	public static final String ELECTRONICS_MENU_TEXT = "Electronics";
	public static final String BASE_URL = "baseURL";
	public static final long THIRTY_SECONDS = 30;
}
