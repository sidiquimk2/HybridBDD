package com.Hybrid.stepDefinitions;

import org.openqa.selenium.JavascriptExecutor;

import com.Hybrid.pagessds.TC2AddCandidatesPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC2AddCandidatesSteps extends BaseClass{
	
	TC2AddCandidatesPage candidate;
	
	@When("^I click Recruitment Module and click Candidates$")
	public void i_click_Recruitment_Module_and_click_Candidates() throws Throwable {
		candidate = new TC2AddCandidatesPage();
		CommonMethods.clickLink(candidate.recruitementLink, "Recruitment");
		CommonMethods.clickLink(candidate.candidatesLink, "Candidates");
		Thread.sleep(2000);
	}

	@When("^Click Add$")
	public void click_Add() throws Throwable {
		CommonMethods.click(candidate.addBtn);
		Thread.sleep(2000);
	}

	@When("^Enter First, Middle, Last Name$")
	public void enter_First_Middle_Last_Name() throws Throwable {
		CommonMethods.enterValue(candidate.firstName, "First");
		CommonMethods.enterValue(candidate.middleName, "Middle");
		CommonMethods.enterValue(candidate.lastName, "Last");
		Thread.sleep(2000);
	}

	@When("^Enter Email and Contact No$")
	public void enter_Email_and_Contact_No() throws Throwable {
		CommonMethods.enterValue(candidate.emailID, "candidate1@gmail.com");
		CommonMethods.enterValue(candidate.contactNo, "12345456");
		Thread.sleep(2000);
	}

	@When("^I see Job Vacancy is displayed$")
	public void i_see_Job_Vacancy_is_displayed() throws Throwable {
		CommonMethods.selectValue(candidate.vacancy, "v3");
		Thread.sleep(2000);
	}

	@When("^I enter any Keywords and any Comments$")
	public void i_enter_any_Keywords_and_any_Comments() throws Throwable {
		CommonMethods.enterValue(candidate.keyWord, "keyworkeyworkkeywor");
		CommonMethods.enterValue(candidate.comment, "comment comment comeent");
		Thread.sleep(2000);
	}

	@When("^I select a Date Of Application$")
	public void i_select_a_Date_Of_Application() throws Throwable {
		candidate.date.clear();
		Thread.sleep(2000);
		CommonMethods.enterValue(candidate.date, "26-12-2018");
		Thread.sleep(2000);
		candidate.firstName.clear();
		CommonMethods.enterValue(candidate.firstName, "First");
		Thread.sleep(2000);
	}

	@When("^I click Save button$")
	public void i_click_Save_button() throws Throwable {
		CommonMethods.click(candidate.saveBtn);
		Thread.sleep(2000);
		CommonMethods.clickLink(candidate.recruitementLink, "Recruitment");
		CommonMethods.clickLink(candidate.candidatesLink, "Candidates");
		Thread.sleep(2000);
		
		
/*		driver.navigate().refresh();
		Thread.sleep(6000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,4000)"); //scroll down
		Thread.sleep(2000);*/
	}

	@Then("^I see Candidate appears in Candidates History$")
	public void i_see_Candidate_appears_in_Candidates_History() throws Throwable {
		CommonMethods.verificationMethod(candidate.table, "First Middle Last", "//table[@id='resultTable']/tbody/tr/td");
	}

}
