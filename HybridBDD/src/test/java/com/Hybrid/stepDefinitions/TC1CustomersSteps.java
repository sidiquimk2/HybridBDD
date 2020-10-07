package com.Hybrid.stepDefinitions;

import com.Hybrid.pagessds.TC1CustomersPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1CustomersSteps extends BaseClass {
	
	TC1CustomersPage customer;
	
	@When("^I am on Time Module$")
	public void i_am_on_Time_Module() throws Throwable {
		customer = new TC1CustomersPage();
		CommonMethods.clickLink(customer.timelink, "Time");
	}

	@When("^I click Project info$")
	public void i_click_Project_info() throws Throwable {
		CommonMethods.clickLink(customer.projectInfoLink, "Project Info");
	}

	@When("^I select Customers$")
	public void i_select_Customers() throws Throwable {
		CommonMethods.clickLink(customer.customersLink, "Customers");
	}

	@When("^I click on Add button$")
	public void i_click_on_Add_button() throws Throwable {
		CommonMethods.click(customer.addBtn);
	}

	@When("^Customer Name and Description$")
	public void customer_Name_and_Description() throws Throwable {
		CommonMethods.enterValue(customer.customerName, "Customer1");
		CommonMethods.enterValue(customer.customerDisc, "Discription for customer1");
		Thread.sleep(3000);
	}

	@When("^I click Save$")
	public void i_click_Save() throws Throwable {
		CommonMethods.click(customer.saveBtn);
		Thread.sleep(3000);
	}

	@Then("^I see that the customer is displayed in the Customers table$")
	public void i_see_that_the_customer_is_displayed_in_the_Customers_table() throws Throwable {
    CommonMethods.verificationMethod(customer.table, "Customer1", "//table[@id='resultTable']/tbody/tr/td");
	}

}
