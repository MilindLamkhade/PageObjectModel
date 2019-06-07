package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {

		initialization();
		 homePage=new HomePage();
	}
	@Test(priority=1)
	public void HomePagetitleTest(){
		String title=homePage.validateHomepageTitle();
		Assert.assertEquals(title, "PHPTRAVELS | Travel Technology Partner");
	
		
	}
	
	/*
	@Test(priority=2)
	public void ClickonMyAccountTest(){
		homePage.myAccount();
	}
	
	@Test(priority=3)
	public void ClickonloginLinkTest(){
		homePage.loginLink();
	}
	
	
	
	@Test(priority=2)
	public void SignUpTest()
	{
		loginPage.SignUP();
		String title=loginPage.validateLoginpageTitle();
		Assert.assertEquals(title, "Login - My Store");

	}
	
	*/
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
}
