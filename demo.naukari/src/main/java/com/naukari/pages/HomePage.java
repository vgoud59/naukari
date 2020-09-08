package com.naukari.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naukari.base.TestBase;

public class HomePage extends TestBase {
	
	
	
	
	@FindBy(xpath="//div[@class='crossIcon chatBot chatBot-ic-cross']")
	WebElement Chatbotclose;
	@FindBy(xpath="//div[@class='btn btn-block btn-large white-text']")
	WebElement submit;
	@FindBy(xpath="//input[@id='attachCV']")
	WebElement uploadcv;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void closechat() {
		Chatbotclose.click();
	}

	public void update() {
		
		submit.click();
	}

   public void uploadcv() {
	   uploadcv.sendKeys("A:\\Users\\Kesari  Vamshi Goud\\Desktop\\resume-samples.pdf");
   }
	
		
	}
	
