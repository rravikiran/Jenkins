package org.ravikiran.selenium.SeleniumJenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstJenkins {

	private WebDriver driver;
	String appURL = "www.google.com";

	@BeforeClass
	public void testSetUp() {

		System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void verifyGooglePageTittle() {
		driver.get("https://www.google.com");
		String getTitle = driver.getTitle();
		System.out.println("The title of the page is" + getTitle);
		System.out.println("Your script is pass");
		System.out.println("Your script is pass");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
