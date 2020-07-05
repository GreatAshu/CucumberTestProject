package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application(){
		System.out.println("OpenBrowsers");
	}
	
	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String username, String password) {
	   System.out.println("username: "+username + " password: "+password);
	}

	
	@Then("^user should get error message$")
	public void user_should_get_error_message(){
		System.out.println("error msg");
	}
}
