package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.TestBase;

public class loginPage extends TestBase {
	
	//object repository OR Page factory--@FindBy annotation used
	
	//Objects
	@FindBy (id="FormsPH_ctrlLogin_LoginUser_UserName")
	WebElement username;
	
	@FindBy (name="ctl00$FormsPH$ctrlLogin$LoginUser$Password")
	WebElement password;
	
	@FindBy (xpath="//input[@value='Login']")
	WebElement loginbtn;

	@FindBy (xpath="span[contains(text(),'New User Registration')]")
	WebElement newUserReg;
	
	//Constructor used to initialize above page objects (page factory) using driver
	//this used to point out current class objects
	//driver coming from base class
	public loginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Methods or Actions
	
	public String validateLoginPageTitle(){		
		return driver.getTitle();		
	}
	public Welcomepage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new Welcomepage();
	}

}

