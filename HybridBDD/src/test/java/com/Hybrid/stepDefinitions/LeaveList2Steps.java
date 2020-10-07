package com.Hybrid.stepDefinitions;

import com.Hybrid.pagessds.LeaveListPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LeaveList2Steps extends BaseClass {
	LeaveListPage leaveList;

	@When("^I select From Date that matches the assign leave to Unique default employee$")
	public void i_select_From_Date_that_matches_the_assign_leave_to_Unique_default_employee() throws Throwable {
		leaveList = new LeaveListPage();
		leaveList.leaveListFromDate.clear();
		CommonMethods.enterValue(leaveList.leaveListFromDate, "2018-12-21");
		Thread.sleep(2000);

	}

	@When("^I select To Date that matches the assign leave to Unique default employee$")
	public void i_select_To_Date_that_matches_the_assign_leave_to_Unique_default_employee() throws Throwable {
		leaveList.leaveListToDate.clear();
		CommonMethods.enterValue(leaveList.leaveListToDate, "2018-12-25");
		Thread.sleep(3000);
	}

	@When("^I enter the Unique default employee name$")
	public void i_enter_the_Unique_default_employee_name() throws Throwable {
		CommonMethods.enterValue(leaveList.leaveListEmpName, "Russel Hamilton");
		Thread.sleep(2000);
	}

	@When("^I select Sub Unit that matches the Unique default employee credentials$")
	public void i_select_Sub_Unit_that_matches_the_Unique_default_employee_credentials() throws Throwable {
		Thread.sleep(2000);
		CommonMethods.selectValue(leaveList.leaveListSubUnit, "All");
	}

	@Then("^Verify that Unique default employee name appears$")
	public void verify_that_Unique_default_employee_name_appears() throws Throwable {
		String empName = leaveList.EmpNameVerification.getText();
		System.out.println("The Unique Default employee name is: " + empName);
		Thread.sleep(2000);
	}

	@Then("^Verify leave type displays as the given Leave Type Assigned Unique default employee$")
	public void verify_leave_type_displays_as_the_given_Leave_Type_Assigned_Unique_default_employee() throws Throwable {
		String leaveType = leaveList.LeaveTypeVerification.getText();
		System.out.println("The Unique Default leave type is: " + leaveType);
		Thread.sleep(2000);
	}

	@Then("^Verify Number of days matches the amount of assigned leave given for Unique default employee$")
	public void verify_Number_of_days_matches_the_amount_of_assigned_leave_given_for_Unique_default_employee()
			throws Throwable {
		String numDays = leaveList.NoDaysVerification.getText();
		System.out.println("The Unique Default employee num of days: " + numDays);
		Thread.sleep(2000);

	}

}
