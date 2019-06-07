package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory-OR
	

	
	@FindBy(name="username")
	WebElement username;

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@type='submit' and contains(text(),'Login')]")
	WebElement loginBtn;

	
	@FindBy(xpath="//*[@class='login']")
	WebElement SignInBtn;
	
//Initializing the page objects
public LoginPage() {
	PageFactory.initElements(driver, this);

}


//Actions


public String validateLoginTitle()
{
	return driver.getTitle();
}


/*
public Boolean validateTravelsLogo() {
	return travelLogo.isdisplayed();
}
*/

public void SignUP() {
	SignInBtn.click();
	
}


public AccountPage login(String un,String pwd) {
	
	username.sendKeys(un);
	password.sendKeys(pwd);
	loginBtn.click();
	
	return new AccountPage();
}


}