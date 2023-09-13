package com.qa.page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LogOutPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\\\"MenuContent\\\"]/a[2]")
	static WebElement LogOutBtn;
	
	//Initializing the page objects
	
		public LogOutPage() {
			PageFactory.initElements(driver,this);
		}
	
	public static void LogOutBtn() {
		LogOutBtn.click();
	}

}
