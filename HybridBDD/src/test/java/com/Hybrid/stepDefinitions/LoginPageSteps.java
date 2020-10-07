package com.Hybrid.stepDefinitions;

import org.junit.Assert;

import com.Hybrid.pagessds.LoginPage;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {

	LoginPage login;

	@Given("^OrangeHRM logo is displayed$")
	public void orangehrm_logo_is_displayed() {
		login = new LoginPage();
		Assert.assertTrue(login.logo.isDisplayed());
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String value1, String value2) {
		CommonMethods.enterValue(login.username, value1);
		CommonMethods.enterValue(login.password, value2);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
		CommonMethods.click(login.btnLogin);
	}

	@Then("^I successfully logged in$")
	public void i_successfully_logged_in() {

	}
	
	@Then("^I see error message \"([^\"]*)\"$")
	public void i_see_error_message(String errMessage) throws Throwable {
		String actualError = login.errorMessage.getText();
        Assert.assertEquals(errMessage, actualError);
	}
}
