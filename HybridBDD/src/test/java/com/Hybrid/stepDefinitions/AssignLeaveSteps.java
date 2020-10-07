package com.Hybrid.stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Hybrid.pagessds.AssignLeavePage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssignLeaveSteps extends BaseClass {
	AssignLeavePage leave;

	@When("^I click Leave Module and click Assign Leave$")
	public void i_click_Leave_Module_and_click_Assign_Leave() throws Throwable {
		leave = new AssignLeavePage();
		CommonMethods.clickLink(leave.LeaveLink, "Leave");
		CommonMethods.clickLink(leave.assignLeaveLink, "Assign Leave");
	}

	@And("^I enter any one of the default employee names$")
	public void i_enter_any_one_of_the_default_employee_names() throws Throwable {
		CommonMethods.enterValue(leave.assignLeaveEmpName, "Steven Edwards"); 
	}

	@And("^I select FMLA US$")
	public void i_select_FMLA_US() throws Throwable {
		CommonMethods.selectValue(leave.assignLeaveType, "FMLA US");
		Thread.sleep(5000);
	}

	@When("^Balance of (\\d+) should be present for employee$")
	public void balance_of_should_be_present_for_employee(int arg1) throws Throwable {
		String balanceText = leave.assignLeaveBalance.getText();
		System.out.println("Leave Balance is Begining: " + balanceText);
	}

	@And("^I select From Date$")
	public void i_select_From_Date() throws Throwable {
		leave.assignLeaveFromDate.clear();
		CommonMethods.enterValue(leave.assignLeaveFromDate, "2018-12-21");
		Thread.sleep(2000);
	}

	@When("^I select To Date that does not exceed (\\d+) days$")
	public void i_select_To_Date_that_does_not_exceed_days(int arg1) throws Throwable {
		leave.assignLeaveToDate.clear();
		CommonMethods.enterValue(leave.assignLeaveToDate, "2018-12-25");
		Thread.sleep(2000);
		CommonMethods.click(leave.assignLeaveAssignBtn);
		Thread.sleep(5000);
	}

	@Then("^I should see that the leave balance has changed based on how many days that was taken$")
	public void i_should_see_that_the_leave_balance_has_changed_based_on_how_many_days_that_was_taken()
			throws Throwable {

		String balanceText = leave.assignLeaveBalance.getText();
		System.out.println("Leave Balance is Ending: " + balanceText);
	}

	@When("^I enter the unique default employee name who was chosen for a different Leave Type$")
	public void i_enter_the_unique_default_employee_name_who_was_chosen_for_a_different_Leave_Type() throws Throwable {
		CommonMethods.enterValue(leave.assignLeaveEmpName, "Russel Hamilton"); 
	}

	@When("^I select any Leave Type$")
	public void i_select_any_Leave_Type() throws Throwable {
		CommonMethods.selectValue(leave.assignLeaveType, "Vacation US");
		CommonMethods.click(leave.assignLeaveAssignBtn);

	}

}
