package com.naukari.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

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
	   uploadcv.sendKeys(getFile());
	  
   }
String getFile() {
	return new File ("./file/resume.pdf").getAbsolutePath();
	
}
   
   
	public void Robot() throws AWTException

	   {     
		
		   
		     
		   Robot robot = new Robot();
		   robot.setAutoDelay(3000);
		    
		    robot.setAutoDelay(10000);
		StringSelection stringSelection = new StringSelection ("./file/resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		robot.setAutoDelay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.setAutoDelay(1000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	   }
	
   
   
   
		
	}
	
