package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class AssignLeavePage extends BaseClass {

	@FindBy(id = "menu_leave_viewLeaveModule")
	public static WebElement LeaveLink;

	@FindBy(id = "menu_leave_assignLeave")
	public static WebElement assignLeaveLink;

	@FindBy(id = "assignleave_txtEmployee_empName")
	public static WebElement assignLeaveEmpName;

	@FindBy(id = "assignleave_txtLeaveType")
	public static WebElement assignLeaveType;

	@FindBy(id = "assignleave_leaveBalance")
	public static WebElement assignLeaveBalance;

	@FindBy(xpath = "//input[@id='assignleave_txtFromDate']")
	public static WebElement assignLeaveFromDate;

	@FindBy(xpath = "//input[@id='assignleave_txtToDate']")
	public static WebElement assignLeaveToDate;

	@FindBy(id = "assignBtn")
	public static WebElement assignLeaveAssignBtn;

	public AssignLeavePage() {
		PageFactory.initElements(driver, this);
	}

}
