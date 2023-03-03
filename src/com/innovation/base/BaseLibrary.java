package com.innovation.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import com.innovation.constants.FlipkartAutomationConstants;
import com.innovation.helper.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseLibrary {

	public static ReadConfig readconfig = new ReadConfig();
	public static String url = readconfig.getPropertiesValue();
	public static WebDriver driver;

	public void lauchApplication(String browser) {
		browser = FlipkartAutomationConstants.BROWSER_TEXT_CHROME;

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
