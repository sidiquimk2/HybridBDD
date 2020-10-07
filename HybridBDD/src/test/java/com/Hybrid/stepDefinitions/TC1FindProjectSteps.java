package com.Hybrid.stepDefinitions;

import com.Hybrid.pagessds.TC1FindProjectPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1FindProjectSteps extends BaseClass{
	
	TC1FindProjectPage find;
	
	@When("^I click on Projects$")
	public void i_click_on_Projects() throws Throwable {
		find = new TC1FindProjectPage();
		CommonMethods.clickLink(find.projectsLink, "Projects");
	}

	@When("^I enter Customer name from the previous entry$")
	public void i_enter_Customer_name_from_the_previous_entry() throws Throwable {
		CommonMethods.enterValue(find.pCustomerName, "Customer1");
	}

	@When("^I enter Project name from the previous entry$")
	public void i_enter_Project_name_from_the_previous_entry() throws Throwable {
		CommonMethods.enterValue(find.projectName, "Project1");
	}

	@When("^Click on Search$")
	public void click_on_Search() throws Throwable {
		CommonMethods.click(find.searchBtn);
		Thread.sleep(5000);
	}

	@Then("^My customer name and project name displayed$")
	public void my_customer_name_and_project_name_displayed() throws Throwable {
		CommonMethods.verificationMethod(find.table, "Project1", "//Table[@id='resultTable']/tbody/tr/td");
	}

}
