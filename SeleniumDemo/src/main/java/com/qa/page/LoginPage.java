package com.qa.page;

import java.util.Base64;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(xpath="//*[@id=\\\"Content\\\"]/p[1]/a")
	static WebElement SignInBtn;
	
	@FindBy(name="username")
	static WebElement username;
	
	@FindBy(name="password")
	static WebElement password;
	
	@FindBy(name="signon")
	WebElement signon;
	
	@FindBy(xpath="//*[@id=\\\"MenuContent\\\"]/a[2]")
	WebElement SignOutBtn;
	
	String pwd= decodeString("QmlnaG5lc2hAMTIzMQ==");
	
	//Initializing the page objects
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions- Validate Login Title page
	
	public LoginPage(WebDriver loginPageDriver) {
	    this.driver=loginPageDriver;
	} 
	public static String LoginTitle() {
		
	return driver.getTitle();
	}
	
	//Click on Login Button
	public static void ClickLoginBtn() {
		SignInBtn.click();
	}
	
	public static void HomePagLogin(String Bighnesh, String pwd) {
		
		username.sendKeys(Bighnesh);
		password.clear();
		password.sendKeys(pwd);
		driver.findElement(By.name("signon")).click();
	}
	
	static String decodeString(String Password) {
		
		byte[] decrypt= Base64.getDecoder().decode(Password);
		return (new String(decrypt));
			
	}
	
	
	

}
