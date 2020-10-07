package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class TC1ProjectPage extends BaseClass {
	
	@FindBy (id = "menu_time_viewTimeModule")
	public static WebElement timelink; 
	
	@FindBy (id = "menu_admin_ProjectInfo")
	public static WebElement projectInfoLink; 
	
	@FindBy (id = "menu_admin_viewProjects")
	public static WebElement projectsLink; 
	
	@FindBy (id = "btnAdd")
	public static WebElement addProjectBtn; 
	
	@FindBy (id = "addProject_customerName")
	public static WebElement PcustomerName; 
	
	@FindBy (id = "addProject_projectName")
	public static WebElement projectName; 
	
	@FindBy (id = "addProject_projectAdmin_1")
	public static WebElement projectAdmin; 
	
	@FindBy (xpath = "//input[@id='btnSave']")
	public static WebElement saveProjectBtn; 
	
	@FindBy (xpath = "//table[@id='resultTable']/tbody/tr/td")
	public static WebElement table; 
	
	
	
	public TC1ProjectPage(){
		PageFactory.initElements(driver, this);
	}

}
