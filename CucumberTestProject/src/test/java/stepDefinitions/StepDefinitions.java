package stepDefinitions;


import java.util.List;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.Messages.GherkinDocument.Feature.Step.DataTable;
import io.cucumber.messages.Messages.GherkinDocument.Feature.TableRow;


public class StepDefinitions {

	@Given("^Open chrome and start application$")
	public void Open_chrome_and_start_application(){
		System.out.println("OpenBrowsers");
	}
	
	@When("I enter valid {string} and valid {string}")
	public void i_enter_valid_and_valid(String username, String password) {
	   System.out.println("username: "+username + " password: "+password);
	   System.out.println("============================================");   
	}
	
	@When("I do enter valid usrname and valid password")
    public void i_do_enter_valid_something_and_valid_something() throws Throwable {
       /*List<TableRow> data = table.getRowsList();
       		for(TableRow tblrw: data ){
       			System.out.println("DATA: "+tblrw);
       		}*/
    		   
    }

	@Then("^user should not get error message$")
    public void user_should_not_get_error_message() throws Throwable {
       System.out.println("No Error Msg");
    } 
	
	@Then("^user should get error message$")
	public void user_should_get_error_message(){
		System.out.println("error msg");
	}
}
