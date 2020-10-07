package com.Hybrid.stepDefinitions;

import com.Hybrid.pagessds.TC2SearchCandidatesPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC2SearchCandidatesSteps extends BaseClass {
	TC2SearchCandidatesPage search;
	
	@When("^I Select All from Job Title$")
	public void i_Select_All_from_Job_Title() throws Throwable {
		search = new TC2SearchCandidatesPage();
		CommonMethods.selectValue(search.jobTitle, "All");
	}

	@When("^I Select All from Vacancy$")
	public void i_Select_All_from_Vacancy() throws Throwable {
		CommonMethods.selectValue(search.vacancy, "All");
	}

	@When("^I Select All from the Hiring Manager$")
	public void i_Select_All_from_the_Hiring_Manager() throws Throwable {
		CommonMethods.selectValue(search.hiringManager, "All");
	}

	@When("^I Select All from Status$")
	public void i_Select_All_from_Status() throws Throwable {
		CommonMethods.selectValue(search.status, "All");
	}

	@When("^I Enter Candidates Name from the previous entry$")
	public void i_Enter_Candidates_Name_from_the_previous_entry() throws Throwable {
		CommonMethods.enterValue(search.cadidateName, "First Middle Last");
	}

	@When("^Select Date of Application the previous entry$")
	public void select_Date_of_Application_the_previous_entry() throws Throwable {
		CommonMethods.enterValue(search.fromDate, "24-12-2018");
		CommonMethods.enterValue(search.toDate, "27-12-2018");
	}

	@When("^Select Methods of Application to Manual$")
	public void select_Methods_of_Application_to_Manual() throws Throwable {
		CommonMethods.selectValue(search.methodOfApp, "Manual");
	}

	@When("^Click the Search$")
	public void click_the_Search() throws Throwable {
		CommonMethods.click(search.searchBtn);
		Thread.sleep(2000);
	}

	@Then("^I see Candidate is present$")
	public void i_see_Candidate_is_present() throws Throwable {
		CommonMethods.verificationMethod(search.table, "First Middle Last", "//table[@id='resultTable']/tbody/tr/td");
	}


}
