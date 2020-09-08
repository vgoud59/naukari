package com.naukari.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukari.base.TestBase;

public class LoginPage extends TestBase{

	//Pagefinders
	@FindBy(xpath="//a[@id=\"login_Layer\"]")
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your active Email ID / Username\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder=\"Enter your password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
    WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void clickonlogin() {
		
		login.click();
	}
	
	public void  login(String ur,String pwd) {
		username.sendKeys(ur);
		password.sendKeys(pwd);
		
			}
	
	public void submit() {
		
		submit.click();
	}
		
	


	
}
