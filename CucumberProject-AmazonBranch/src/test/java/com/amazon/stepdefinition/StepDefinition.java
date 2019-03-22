package com.amazon.stepdefinition;

import java.io.File;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.amazon.baseclass.BaseClass;
import com.amazon.helper.FileReaderManager;
import com.amazon.helper.PageObjectManager;
import com.amazon.testrunner.TestRunner;
import com.cucumber.listener.Reporter;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{
	
	public static WebDriver driver = TestRunner.driver;
	public static PageObjectManager pm = new PageObjectManager(driver);
	
	@Given("^User launch the applciation$")
	public void user_launch_the_applciation() throws Throwable {
		String url = FileReaderManager.getInstance().getConfigReader().getUrl();
		getUrl(url);
	}

	@When("^User verify the amazon logo present in the page$")
	public void user_verify_amazon_logo() {
		boolean elementDisplayed = elementDisplayed(pm.getHomePage().getAmazonLogo());
		Assert.assertTrue(elementDisplayed);
	}
	
	@When("^User moushover to the Hello sign in$")
	public void user_moushover_to_the_Hello_sign_in() throws Throwable {
	    movetoElement(pm.getHomePage().getSignIn());
	    
	}

	@When("^User wait for '(\\d+)' seconds$")
	public void user_wait_for_seconds(int arg1) throws Throwable {
		int i = arg1 * 1000;
		Thread.sleep(i);
	}

	@When("^User click on sign in button on ajax call$")
	public void user_click_on_sign_in_button_on_ajax_call() throws Throwable {
	    
	    elementClick(pm.getHomePage().getSignInBtn());
	}

	@When("^User enter the username '(\\d+)' in the emailid/mobile number$")
	public void user_enter_the_username_in_the_emailid_mobile_number(String arg1) throws Throwable {
	    inputValuestoElement(pm.getLoginPage().getEmailIdFeild(), arg1);
	    
	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
	    elementClick(pm.getLoginPage().getContinueBtn());
	    
	}

	@Then("^User verify the entered mobile number '(.*)' displays on the mobile number feild$")
	public void user_verify_the_entered_mobile_number_displays_on_the_mobile_number_feild(String num) throws Throwable {
	    
	    String elementText = getElementText(pm.getLoginPage().getMobileText());
	    Assert.assertEquals(num, elementText);
	}

	@When("^User enter the password '(\\d+)' in the password feild$")
	public void user_enter_the_password_in_the_password_feild(String arg1) throws Throwable {
	    
	    inputValuestoElement(pm.getLoginPage().getPasswordFeild(), arg1);
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    
	    elementClick(pm.getLoginPage().getLoginBtn_LoginPage());
	}

	@Then("^User verify the username '(.*)' in the header page$")
	public void user_verify_the_username_Hello_harish_in_the_header_page(String name) throws Throwable {
	    
	    String elementText = getElementText(pm.getHomePage().getUserName_header());
	    Assert.assertEquals(name, elementText);
	    File takeScreenShot = BaseClass.takeScreenShot(name);
	    Reporter.addScreenCaptureFromPath(takeScreenShot.getAbsolutePath());
	}

	

}
