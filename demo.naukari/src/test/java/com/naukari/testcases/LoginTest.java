package com.naukari.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukari.base.TestBase;
import com.naukari.pages.LoginPage;

public class LoginTest  extends TestBase{
	LoginPage loginpage;
	
	public LoginTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initialization();
		loginpage = new LoginPage();
		
	}
	
	
    @Test
    
    public void Login() {
    	loginpage.clickonlogin();
    	
    	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    	loginpage.submit();
    	}
    
}

