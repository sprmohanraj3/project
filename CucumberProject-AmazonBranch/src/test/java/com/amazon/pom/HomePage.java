package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;
	@FindBy(id = "nav-logo")
	private WebElement amazonLogo;

	@FindBy(xpath = "//span[contains(text(),'Hello')]")
	private WebElement signIn;

	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span")
	private WebElement signInBtn;

	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchFeild;

	@FindBy(xpath = "//input[@value='Go']")
	private WebElement submitBtn;

	@FindBy(xpath = "//a[@id='nav-link-yourAccount']/span[1]")
	private WebElement userName_header;

	public WebElement getUserName_header() {
		return userName_header;
	}

	public HomePage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAmazonLogo() {
		return amazonLogo;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getSearchFeild() {
		return searchFeild;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

}
