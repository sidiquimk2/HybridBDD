package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class LeaveListPage extends BaseClass {

	@FindBy(id = "menu_leave_viewLeaveModule")
	public static WebElement leaveLink;

	@FindBy(id = "menu_leave_viewLeaveList")
	public static WebElement leaveListLink;

	@FindBy(id = "calFromDate")
	public static WebElement leaveListFromDate;

	@FindBy(id = "calToDate")
	public static WebElement leaveListToDate;

	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_3']")
	public static WebElement leaveListTakenChBx;

	@FindBy(xpath = "//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")
	public static WebElement leaveListAllCheckBox;

	@FindBy(id = "leaveList_txtEmployee_empName")
	public static WebElement leaveListEmpName;

	@FindBy(id = "leaveList_cmbSubunit")
	public static WebElement leaveListSubUnit;

	@FindBy(id = "btnSearch")
	public static WebElement leaveListSeachBtn;

	@FindBy(xpath = "//tr[@class='odd']/td[2]")
	public static WebElement EmpNameVerification;

	@FindBy(xpath = "//tr[@class='odd']/td[3]")
	public static WebElement LeaveTypeVerification;

	@FindBy(xpath = "//tr[@class='odd']/td[5]")
	public static WebElement NoDaysVerification;

	public LeaveListPage() {
		PageFactory.initElements(driver, this);
	}

}
