package com.Hybrid.stepDefinitions;

import com.Hybrid.pagessds.CRMAddContactPage;
import com.Hybrid.utils.BaseClass;
import com.Hybrid.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CRMAddContactSteps extends BaseClass {
	
	CRMAddContactPage contact;

	@Given("^I login using valid ID and password$")
	public void i_login_using_valid_ID_and_password() throws Throwable {
		contact = new CRMAddContactPage();
		CommonMethods.enterValue(contact.userName, prop.getProperty("UNfreeCRM"));
		CommonMethods.enterValue(contact.password, prop.getProperty("PfreeCRM"));
		CommonMethods.click(contact.loginBtn);
		Thread.sleep(5000);
	}

	@When("^I click on contacts and new contact$")
	public void i_click_on_contacts_and_new_contact() throws Throwable {
	}

	@When("^I select criteria from title$")
	public void i_select_criteria_from_title() throws Throwable {
	}

	@When("^I enter First name , middle name and last name$")
	public void i_enter_First_name_middle_name_and_last_name() throws Throwable {
	}

	@When("^I select criteria from suffix$")
	public void i_select_criteria_from_suffix() throws Throwable {
	}

	@When("^I enter nick name , company name, position , department , supervisor name, assistant , reffered by$")
	public void i_enter_nick_name_company_name_position_department_supervisor_name_assistant_reffered_by()
			throws Throwable {
	}

	@When("^I select criteria from category and status$")
	public void i_select_criteria_from_category_and_status() throws Throwable {
	}

	@When("^I enter phone, mobile home fone, fax , email and alternative email$")
	public void i_enter_phone_mobile_home_fone_fax_email_and_alternative_email() throws Throwable {
	}

	@When("^I select chekboxes of receive email, receive sms, allow calls$")
	public void i_select_chekboxes_of_receive_email_receive_sms_allow_calls() throws Throwable {
	}

	@When("^I enter messenger ID$")
	public void i_enter_messenger_ID() throws Throwable {
	}

	@When("^I select criteria from messenger network$")
	public void i_select_criteria_from_messenger_network() throws Throwable {
	}

	@When("^I enter skype ID$")
	public void i_enter_skype_ID() throws Throwable {
	}

	@When("^I select criteria from source$")
	public void i_select_criteria_from_source() throws Throwable {
	}

	@When("^I enter birthday and identifier$")
	public void i_enter_birthday_and_identifier() throws Throwable {
	}

	@When("^I enter address title$")
	public void i_enter_address_title() throws Throwable {
	}

	@When("^I select criteria from type$")
	public void i_select_criteria_from_type() throws Throwable {
	}

	@When("^I enter default address, city, state, zip code , country, tags , notes$")
	public void i_enter_default_address_city_state_zip_code_country_tags_notes() throws Throwable {
	}

	@When("^I select criteria from contact time zone, filter time zone$")
	public void i_select_criteria_from_contact_time_zone_filter_time_zone() throws Throwable {
	}

	@When("^I click save button$")
	public void i_click_save_button() throws Throwable {
	}

	@Then("^I verify my new contact$")
	public void i_verify_my_new_contact() throws Throwable {

	}
}
