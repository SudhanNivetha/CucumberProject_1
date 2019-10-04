package stepDefinitionPack;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;




public class tagingCuCustepDef 
{
	@Given("^enter valid username and valid password$")
	public void enter_valid_username_and_valid_password(Scenario scenario) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	String s=scenario.getName();
	System.out.println("value is"+s);
	    
	}

	@Given("^enter invalid username and invalid password$")
	public void enter_invalid_username_and_invalid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^enter valid username and invalid password$")
	public void enter_valid_username_and_invalid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^enter invalid username and valid password$")
	public void enter_invalid_username_and_valid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



}
