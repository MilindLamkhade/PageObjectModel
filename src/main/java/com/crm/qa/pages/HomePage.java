package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	/*@FindBy(xpath="//*[@id='li_myaccount']//*[@aria-expanded='false']")
	WebElement MyAccountLink;
	
	@FindBy(xpath="//*[@id=\"li_myaccount\"]/ul/li[1]/a")
	WebElement LoginLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	*/
	//Actions
	public String validateHomepageTitle()
	{
		return driver.getTitle();
	}

	
	/*public void myAccount() {
		MyAccountLink.click();
		
	}
	
	
	public LoginPage loginLink() {
		LoginLink.click();
		return new LoginPage();*/
		
	}
	
	

