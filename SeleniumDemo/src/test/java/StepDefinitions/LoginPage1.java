package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.page.LoginPage;
import com.qa.util.TestBase;



public class LoginPage1 extends TestBase{

	private static final String String = null;
	WebDriver driver;
	
	@Given("User navigate to shop p1age")
	public void user_navigate_to_shop_page() {
	
	System.out.println("Test");

	TestBase.initialization();
	
	}
	
	@When("User Clicked the signin b1utton")
	public void user_clicked_the_signin_button() {
	
	LoginPage.LoginTitle();
		
	String title = driver.getTitle();
	System.out.println("title of the page is "+title);
	Assert.assertEquals("JPetStore Demo", "JPetStore Demo");
	
	LoginPage.ClickLoginBtn();

	}
	
	@And("User provided username and p1assword")
	public void user_provided_username_and_password() throws Exception {
		
	    LoginPage.HomePagLogin(String ,String );
		}
	
	@And("User clicked the Login b1utton")
	public void user_clicked_the_login_button() throws Exception {
	
	Thread.sleep(2000);
	driver.findElement(By.name("signon")).click();
		
	}


}
