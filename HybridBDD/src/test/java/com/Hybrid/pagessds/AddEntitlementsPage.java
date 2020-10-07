package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class AddEntitlementsPage extends BaseClass {

	@FindBy(id = "txtUsername")
	public static WebElement userName;

	@FindBy(id = "txtPassword")
	public static WebElement password;

	@FindBy(id = "btnLogin")
	public static WebElement btnLogin;

	@FindBy(id = "menu_leave_viewLeaveModule")
	public static WebElement leaveLink;

	@FindBy(id = "menu_leave_Entitlements")
	public static WebElement entitlementsLink;

	@FindBy(id = "menu_leave_addLeaveEntitlement")
	public static WebElement addEntitlementsLink;

	@FindBy(id = "entitlements_filters_bulk_assign")
	public static WebElement AddCheckBox;

	@FindBy(id = "entitlements_filters_location")
	public static WebElement location;

	@FindBy(id = "entitlements_filters_subunit")
	public static WebElement subUnit;

	@FindBy(id = "entitlements_leave_type")
	public static WebElement leaveType;

	@FindBy(id = "period")
	public static WebElement leavePriod;

	@FindBy(id = "entitlements_entitlement")
	public static WebElement entitlement;

	@FindBy(id = "btnSave")
	public static WebElement saveBtn;

	@FindBy(id = "dialogConfirmBtn")
	public static WebElement confirmBtn;

	@FindBy(id = "entitlements_employee_empName")
	public static WebElement empName;

	@FindBy(xpath = "//td[contains(text(),'Added')]")
	public static WebElement addConfirm;
	
	
	@FindBy(xpath = "//b[contains(text(),'PIM')]") //supporting elements
	public static WebElement PIMlink;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']") //supporting elements
	public static WebElement addEmpLink;
	
	@FindBy(id = "firstName") //supporting elements
	public static WebElement AddEmpfirstName;
	
	@FindBy(id = "lastName") //supporting elements
	public static WebElement AddEmpLastName;

	@FindBy(id = "btnSave") //supporting elements
	public static WebElement AddEmpBtnSave;
	
	

	public AddEntitlementsPage() {
		PageFactory.initElements(driver, this);

	}

}
