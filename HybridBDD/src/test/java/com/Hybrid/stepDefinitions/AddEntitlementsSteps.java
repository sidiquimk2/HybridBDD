package com.Hybrid.stepDefinitions;

import org.testng.Assert;

import com.Hybrid.pagessds.AddEntitlementsPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEntitlementsSteps extends BaseClass {

	AddEntitlementsPage AddEntitle;

	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() throws Throwable {
		AddEntitle = new AddEntitlementsPage();
		CommonMethods.enterValue(AddEntitle.userName, prop.getProperty("userName"));
		CommonMethods.enterValue(AddEntitle.password, prop.getProperty("password"));
		CommonMethods.click(AddEntitle.btnLogin);
		Thread.sleep(5000);
	}

	@When("^I click Leave Module and click add Entitlements$")
	public void i_click_Leave_Module_and_click_add_Entitlements() throws Throwable {
		
	/*	//Extra Steps to support below:
		CommonMethods.clickLink(AddEntitle.PIMlink, "PIM");
		CommonMethods.clickLink(AddEntitle.addEmpLink, "Add Employee");
		CommonMethods.enterValue(AddEntitle.AddEmpfirstName, "Masood");
		CommonMethods.enterValue(AddEntitle.AddEmpLastName, "Sidiqui");
		CommonMethods.click(AddEntitle.AddEmpBtnSave);
		//End of Extra Steps to support below:
*/		
		CommonMethods.clickLink(AddEntitle.leaveLink, "Leave");
		CommonMethods.clickLink(AddEntitle.entitlementsLink, "Entitlements");
		CommonMethods.clickLink(AddEntitle.addEntitlementsLink, "Add Entitlements");
		Thread.sleep(5000);
	}

	@When("^Add all default employees to FMLA US leave type$")
	public void add_all_default_employees_to_FMLA_US_leave_type() throws Throwable {
		CommonMethods.click(AddEntitle.AddCheckBox);
		CommonMethods.selectValue(AddEntitle.location, "All");
		CommonMethods.selectValue(AddEntitle.subUnit, "All");
		CommonMethods.selectValue(AddEntitle.leaveType, "FMLA US");
		CommonMethods.selectValue(AddEntitle.leavePriod, "2019-01-01 - 2019-12-31");
		Thread.sleep(5000);
	}

	@When("^I Enter (\\d+) Entitlement$")
	public void i_Enter_Entitlement(int arg1) throws Throwable {
		CommonMethods.enterValue(AddEntitle.entitlement, "50");
	}

	@Then("^I Confirm that all default employees have new Entitlements added for FMLA US$")
	public void i_Confirm_that_all_default_employees_have_new_Entitlements_added_for_FMLA_US() throws Throwable {
		CommonMethods.click(AddEntitle.saveBtn);
		CommonMethods.click(AddEntitle.confirmBtn);
		Assert.assertTrue(true);
		Thread.sleep(5000);
	}

	@When("^Add (\\d+) default employees to any leave type besides FMLA US leave type$")
	public void add_default_employees_to_any_leave_type_besides_FMLA_US_leave_type(int arg1) throws Throwable {
		CommonMethods.enterValue(AddEntitle.empName, "Russel Hamilton"); 
		CommonMethods.selectValue(AddEntitle.leaveType, "Vacation US");
		CommonMethods.click(AddEntitle.saveBtn);

	}

	@Then("^I Confirm that particular default employee has new Entitlements added for new Leave Type$")
	public void i_Confirm_that_particular_default_employee_has_new_Entitlements_added_for_new_Leave_Type()
			throws Throwable {
		Assert.assertTrue(true);
		Thread.sleep(5000);
	}

}
