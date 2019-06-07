package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.AccountPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	AccountPage accountPage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		initialization();
		homePage=new HomePage();
		loginPage=new LoginPage();
	}
	/*
	@Test(priority=1)
	public void LoginPagetitleTest(){
		String title=loginPage.validateLoginTitle();
		Assert.assertEquals(title, "Login");
	
		
	}

	
	@Test(priority=2)
	public void LoginTest()
	{
		accountPage=loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test(priority=2)
	public void SignUpTest()
	{
		loginPage.SignUP();
		String title=loginPage.validateLoginpageTitle();
		Assert.assertEquals(title, "Login - My Store");

	}*/
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
