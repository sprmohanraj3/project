package com.amazon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	@FindBy(id = "ap_email")
	private WebElement emailIdFeild;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(xpath = "//div[@class='a-row a-spacing-base']/span")
	private WebElement mobileText;

	@FindBy(id = "ap_password")
	private WebElement passwordFeild;

	@FindBy(id = "signInSubmit")
	private WebElement loginBtn_LoginPage;

	public LoginPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailIdFeild() {
		return emailIdFeild;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getMobileText() {
		return mobileText;
	}

	public WebElement getPasswordFeild() {
		return passwordFeild;
	}

	public WebElement getLoginBtn_LoginPage() {
		return loginBtn_LoginPage;
	}
	
	
}
