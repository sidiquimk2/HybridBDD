package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class TC2AddCandidatesPage extends BaseClass {
	@FindBy (id = "menu_recruitment_viewRecruitmentModule")
	public static WebElement recruitementLink;
	
	@FindBy (id = "menu_recruitment_viewCandidates")
	public static WebElement candidatesLink;
	
	@FindBy (id = "btnAdd")
	public static WebElement addBtn;
	
	@FindBy (id = "addCandidate_firstName")
	public static WebElement firstName;
	
	@FindBy (id = "addCandidate_middleName")
	public static WebElement middleName;
	
	@FindBy (id = "addCandidate_lastName")
	public static WebElement lastName;
	
	@FindBy (id = "addCandidate_email")
	public static WebElement emailID;
	
	@FindBy (id = "addCandidate_contactNo")
	public static WebElement contactNo;
	
	@FindBy (id = "addCandidate_vacancy")
	public static WebElement vacancy;
	
	@FindBy (id = "addCandidate_keyWords")
	public static WebElement keyWord;
	
	@FindBy (id = "addCandidate_comment")
	public static WebElement comment;
	
	@FindBy (id = "addCandidate_appliedDate")
	public static WebElement date;
	
	@FindBy (id = "btnSave")
	public static WebElement saveBtn;
	
	@FindBy (id = "//table[@id='resultTable']/tbody/tr/td")
	public static WebElement table;
	
	
	public TC2AddCandidatesPage(){
		PageFactory.initElements(driver, this);
	}
	

}
