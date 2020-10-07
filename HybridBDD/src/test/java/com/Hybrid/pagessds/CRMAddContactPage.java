package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class CRMAddContactPage extends BaseClass{
	
	@FindBy (xpath = "//input[@placeholder='Username']")
	public static WebElement userName;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	public static WebElement password;
	
	@FindBy (xpath = "//input[@value='Login']")
	public static WebElement loginBtn;
	
	@FindBy (linkText = "Contacts")
	public static WebElement contacts;
	
	@FindBy (linkText = "New Contact")
	public static WebElement newContact;
	
	@FindBy (name = "title")
	public static WebElement title;
	
	@FindBy (id = "first_name")
	public static WebElement firstName;
	
	@FindBy (id = "middle_initial")
	public static WebElement middleName;
	
	@FindBy (id = "surname")
	public static WebElement lastName;
	
	@FindBy (name = "suffix")
	public static WebElement suffix;
	
	@FindBy (name = "nickname")
	public static WebElement nickName;
	
	@FindBy (name = "client_lookup")
	public static WebElement company;
	
	@FindBy (id = "company_position")
	public static WebElement position;
	
	@FindBy (id = "department")
	public static WebElement department;
	
	@FindBy (name = "contact_lookup_sup")
	public static WebElement supervisor;
	
	@FindBy (name = "contact_lookup_ass")
	public static WebElement assistant;
	
	@FindBy (name = "contact_lookup_ref")
	public static WebElement refferedBy;
	
	@FindBy (name = "category")
	public static WebElement catagory;
	
	@FindBy (name = "status")
	public static WebElement status;
	
	@FindBy (name = "phone")
	public static WebElement phone;
	
	@FindBy (id = "mobile")
	public static WebElement mobile;
	
	@FindBy (id = "home_phone")
	public static WebElement homePhone;
	
	@FindBy (id = "fax")
	public static WebElement fax;
	
	@FindBy (id = "email")
	public static WebElement email;
	
	@FindBy (id = "email_alt")
	public static WebElement altEmail;
	
	@FindBy (xpath = "//input[@name='receive_email']/../input[@value='N']")
	public static WebElement receiveEmail;
	
	@FindBy (xpath = "//input[@name='receive_sms']/../input[@value='Y']")
	public static WebElement receiveSms;
	
	@FindBy (xpath = "//input[@name='allows_call']/../input[@value='N']")
	public static WebElement allowsCall;
	
	@FindBy (id = "im_id")
	public static WebElement messengerId;
	
	@FindBy (id = "skype_id")
	public static WebElement skypeId;
	
	@FindBy (name = "source")
	public static WebElement source;
	
	@FindBy (name = "birthday")
	public static WebElement birthday;
	
	@FindBy (name = "identifier")
	public static WebElement identifier;
	
	@FindBy (name = "address_title")
	public static WebElement address;
	
	@FindBy (name = "type")
	public static WebElement type;
	
	@FindBy (name = "address")
	public static WebElement defaultAddress;
	
	@FindBy (name = "city")
	public static WebElement city;
	
	@FindBy (name = "state")
	public static WebElement state;
	
	@FindBy (name = "postcode")
	public static WebElement zipCode;
	
	@FindBy (name = "country")
	public static WebElement country;
	
	@FindBy (name = "tags")
	public static WebElement tags;
	
	@FindBy (name = "description")
	public static WebElement notes;
	
	@FindBy (id = "timezone")
	public static WebElement timezoneType;
	
	@FindBy (name = "country")
	public static WebElement timezoneCountry;
	
/*	@FindBy (type = "")
	public static WebElement klasdjlkasd;*/
	
	
	
	
	


	
	
	
	
	
	public CRMAddContactPage(){
		PageFactory.initElements(driver, this);
	}
	

}
