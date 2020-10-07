package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class TC2SearchCandidatesPage extends BaseClass{
	
	@FindBy(id = ("candidateSearch_jobTitle"))
	public static WebElement jobTitle;
	
	@FindBy(id = ("candidateSearch_jobVacancy"))
	public static WebElement vacancy;
	
	@FindBy(id = ("candidateSearch_hiringManager"))
	public static WebElement hiringManager;
	
	@FindBy(id = ("candidateSearch_status"))
	public static WebElement status;
	
	@FindBy(id = ("candidateSearch_candidateName"))
	public static WebElement cadidateName;
	
	@FindBy(id = ("candidateSearch_fromDate"))
	public static WebElement fromDate;
	
	@FindBy(id = ("candidateSearch_toDate"))
	public static WebElement toDate;
	
	@FindBy(id = ("candidateSearch_modeOfApplication"))
	public static WebElement methodOfApp;
	
	@FindBy(id = ("btnSrch"))
	public static WebElement searchBtn;
	
	@FindBy(xpath = "//table[@id='resultTable']/tbody/tr/td")
	public static WebElement table;
	
	public TC2SearchCandidatesPage (){
		PageFactory.initElements(driver, this);
	}
	

}
