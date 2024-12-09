package com.mmtools.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void setUp() {
		// Initialize WebDriver before each scenario
		System.setProperty("Chrome", "https://www.mmtoolparts.com/customer/account/create/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() {
		// Quit WebDriver after each scenario
		if (driver != null) {
			driver.quit();
		}
	}
}