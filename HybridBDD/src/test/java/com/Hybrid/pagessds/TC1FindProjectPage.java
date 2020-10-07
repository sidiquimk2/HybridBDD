package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class TC1FindProjectPage extends BaseClass{
	
	@FindBy (id = "menu_admin_viewProjects")
	public static WebElement projectsLink;
	
	@FindBy (id = "searchProject_customer")
	public static WebElement pCustomerName;
	
	@FindBy (id = "searchProject_project")
	public static WebElement projectName;
	
	@FindBy (id = "btnSearch")
	public static WebElement searchBtn;
	
	@FindBy (xpath = "//Table[@id='resultTable']/tbody/tr/td")
	public static WebElement table;
	
	
	public TC1FindProjectPage(){
		PageFactory.initElements(driver, this);
	}
	

}
