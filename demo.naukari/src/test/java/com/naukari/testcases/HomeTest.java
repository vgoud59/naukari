package com.naukari.testcases;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.naukari.base.TestBase;
import com.naukari.pages.HomePage;
import com.naukari.pages.LoginPage;

public class HomeTest extends TestBase {
	
	LoginPage loginpage;
	HomePage homepage;
	
	public HomeTest() {
	
	
		super();
		
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
		
		
		loginpage.clickonlogin();
    	
    	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
    	loginpage.submit();
    	homepage.closechat();
    	homepage.update();
	}
	
	
	@Test
	public void uploadcv() {
		
		
		
		homepage.uploadcv();
		
		
	}
	
	
	
	
	
	
	
	
	
	}
	
