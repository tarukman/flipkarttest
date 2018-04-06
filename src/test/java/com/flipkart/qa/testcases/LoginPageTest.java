package com.flipkart.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.*;
import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.Welcomepage;
import com.flipkart.qa.pages.loginPage;

public class LoginPageTest extends TestBase{
	
	loginPage loginpage; 
	Welcomepage welcomepage;

//Constructor of test class
//use super keyword--Call super class constructor
	public LoginPageTest()
	{
		super();
	}
	
	
//annotations used
 @BeforeMethod
 public void SetUp()
 {
	 initialization();
	 loginpage= new loginPage();
 }
@Test(priority=1)
public void LoginPageTitleTest()
{
  String title= loginpage.validateLoginPageTitle();
  Assert.assertEquals(title, true,"Login-MPSC Online Application System");
}
@Test(priority=2)
public void loginTest()
{
	System.out.println("mangesh");
	System.out.println("tarukhakar");
	//welcomepage= loginpage.login(un, pwd);
  
}
 @AfterMethod
 public void tearDown()
 {
	 driver.quit();
 }
























}
