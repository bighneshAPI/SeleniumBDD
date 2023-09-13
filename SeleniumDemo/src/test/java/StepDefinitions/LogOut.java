package StepDefinitions;

import org.openqa.selenium.support.PageFactory;
import com.qa.page.LogOutPage;
import com.qa.util.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOut extends TestBase{

	//Initializing the page objects
	
		public LogOut() {
			PageFactory.initElements(driver,this);
		}
		
	
	@When("user clicked the Sign out button")
	public void user_clicked_the_sign_out_button() {
	  
	LogOutPage.LogOutBtn();
	
	}

	@Then("User able to signout successfully")
	public void user_able_to_signout_successfully() {
	
	}

}
