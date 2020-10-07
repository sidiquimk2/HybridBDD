package com.Hybrid.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.pagessds.LeaveListPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveListSteps extends BaseClass {
	LeaveListPage leaveList;

	@When("^I click Leave Module and click Leave List$")
	public void i_click_Leave_Module_and_click_Leave_List() throws Throwable {
		leaveList = new LeaveListPage();
		leaveList.leaveLink.click();
		leaveList.leaveListLink.click();
		Thread.sleep(1000);
	}

	@When("^I select From Date that matches the assign leave to default employee$")
	public void i_select_From_Date_that_matches_the_assign_leave_to_default_employee() throws Throwable {
		leaveList.leaveListFromDate.clear();
		CommonMethods.enterValue(leaveList.leaveListFromDate, "2018-12-21");
		Thread.sleep(2000);
	}

	@When("^I select To Date that matches the assign leave to default employee$")
	public void i_select_To_Date_that_matches_the_assign_leave_to_default_employee() throws Throwable {
		leaveList.leaveListToDate.clear();
		CommonMethods.enterValue(leaveList.leaveListToDate, "2018-12-31");
		Thread.sleep(3000);
	}

	@When("^I select on All from show leave with the status$")
	public void i_select_on_All_from_show_leave_with_the_status() throws Throwable {
		leaveList.leaveListTakenChBx.click();
		Thread.sleep(3000);
		leaveList.leaveListAllCheckBox.click();
		Thread.sleep(2000);
	}

	@When("^I enter the default employee name$")
	public void i_enter_the_default_employee_name() throws Throwable {
		CommonMethods.enterValue(leaveList.leaveListEmpName, "Russel Hamilton");
		Thread.sleep(2000);
	}

	@When("^I select Sub Unit that matches the default employee credentials$")
	public void i_select_Sub_Unit_that_matches_the_default_employee_credentials() throws Throwable {
		// CommonMethods.selectValue(leaveList.leaveListSubUnit, "IT");
		Thread.sleep(2000);
		CommonMethods.selectValue(leaveList.leaveListSubUnit, "All");
	}

	@Then("^Click Search$")
	public void click_Search() throws Throwable {
		CommonMethods.click(leaveList.leaveListSeachBtn);
		Thread.sleep(4000);
	}

	@Then("^Verify that default employee name appears$")
	public void verify_that_default_employee_name_appears() throws Throwable {
		String empName = leaveList.EmpNameVerification.getText();
		System.out.println("Default employee name is: " + empName);
		Thread.sleep(2000);
	}

	@Then("^Verify leave type displayed as FMLA US$")
	public void verify_leave_type_displayed_as_FMLA_US() throws Throwable {
		String leaveType = leaveList.LeaveTypeVerification.getText();
		System.out.println("Default leave type is: " + leaveType);
		Thread.sleep(2000);
	}

	@Then("^Verify Number of days matches the amount of assigned leave given for default employee$")
	public void verify_Number_of_days_matches_the_amount_of_assigned_leave_given_for_default_employee()
			throws Throwable {
		String numDays = leaveList.NoDaysVerification.getText();
		System.out.println("Default employee leave num days: " + numDays);
		Thread.sleep(2000);
	}
}
