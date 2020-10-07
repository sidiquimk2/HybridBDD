package com.Hybrid.pagessds;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.utils.BaseClass;

public class PracticePage extends BaseClass{
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	public WebElement PIMlink;
	
	@FindBy(xpath="//tr[@class='odd']/td[3]")
	public WebElement reportLink;
	
	@FindBy(xpath="//a[@href='/index.php/core/definePredefinedReport?reportId=11']")
	public WebElement editBtn;
	
	public PracticePage() {
		PageFactory.initElements(driver, this);
	}

}
