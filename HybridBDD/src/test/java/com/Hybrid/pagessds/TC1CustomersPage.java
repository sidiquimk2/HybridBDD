package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class TC1CustomersPage extends BaseClass {
	
	@FindBy (id = "menu_time_viewTimeModule")
	public static WebElement timelink; 
	
	@FindBy (id = "menu_admin_ProjectInfo")
	public static WebElement projectInfoLink; 
	
	@FindBy (id = "menu_admin_viewCustomers")
	public static WebElement customersLink; 
	
	@FindBy (id = "btnAdd")
	public static WebElement addBtn; 
	
	@FindBy (id = "addCustomer_customerName")
	public static WebElement customerName; 
	
	@FindBy (id = "addCustomer_description")
	public static WebElement customerDisc; 
	
	@FindBy (id = "btnSave")
	public static WebElement saveBtn; 
	
	@FindBy (xpath = "//table[@id='resultTable']/tbody/tr/td")
	public static WebElement table; 
	
	public TC1CustomersPage(){
		PageFactory.initElements(driver, this);
	}
	

}
