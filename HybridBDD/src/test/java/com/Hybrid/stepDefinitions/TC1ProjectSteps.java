package com.Hybrid.stepDefinitions;

import com.Hybrid.pagessds.TC1ProjectPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TC1ProjectSteps extends BaseClass{
	
	TC1ProjectPage project;
	
	@When("^I select Projects$")
	public void i_select_Projects() throws Throwable {
		project = new TC1ProjectPage();
		CommonMethods.clickLink(project.projectsLink, "Projects");
	}

	@When("^I click project Add button$")
	public void i_click_project_Add_button() throws Throwable {
		CommonMethods.click(project.addProjectBtn);
	}

	@When("^I enter customer name from the previous entry$")
	public void i_enter_customer_name_from_the_previous_entry() throws Throwable {
		CommonMethods.enterValue(project.PcustomerName, "Customer1");
	}

	@When("^I add the project name$")
	public void i_add_the_project_name() throws Throwable {
		CommonMethods.enterValue(project.projectName, "Project1");
	}

	@When("^I select Project admin from default employees$")
	public void i_select_Project_admin_from_default_employees() throws Throwable {
		CommonMethods.enterValue(project.projectAdmin, "Steven Edwards");
	}

	@When("^I Click Save button$")
	public void i_Click_Save_button() throws Throwable {
		CommonMethods.click(project.saveProjectBtn);
		Thread.sleep(5000);
	}

	@Then("^I see project details is saved$")
	public void i_see_project_details_is_saved() throws Throwable {
		CommonMethods.clickLink(project.projectInfoLink, "Project Info");
		Thread.sleep(2000);
		CommonMethods.clickLink(project.projectsLink, "Projects");
		Thread.sleep(2000);
		
		CommonMethods.verificationMethod(project.table, "Project1", "//table[@id='resultTable']/tbody/tr/td");
	}


}
