package com.naukari.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukari.base.TestBase;
import com.naukari.pages.LoginPage;

public class LoginTest  extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		
	}
    @Test
    public void Login() {
    	loginpage.clickonlogin();
    	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    	loginpage.Submit
    }
}
