package com.amazon.helper;

import org.apache.poi.ss.formula.functions.LogicalFunction;
import org.openqa.selenium.WebDriver;

import com.amazon.pom.HomePage;
import com.amazon.pom.LoginPage;

public class PageObjectManager {

	private WebDriver driver;

	private HomePage hm;

	private LoginPage lp;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public HomePage getHomePage() {
		if (hm == null) {
			hm = new HomePage(driver);
		}
		return hm;

	}

	public LoginPage getLoginPage() {
		if (lp == null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}
}
