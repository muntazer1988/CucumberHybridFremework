package StepDefinitionFiles;

import io.cucumber.java.en.*;

public class Login {
	
	
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		System.out.println(">> Your in the login page");
	}

	@When("^User enter valid email address (.+)$")
    public void user_enter_valid_email_address(String email) {
		System.out.println(" email added Scenario Examplese: "+email);
    }

    @And("^User enter valid password (.+)$")
    public void user_enter_valid_password(String password)  {
    	System.out.println(" password added Scenario Examplese: "+password);
    }

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println(">> clicked on login button");
	}

	@Then("User should get successfully login")
	public void user_should_get_successfully_login() {
		System.out.println(">> successfully landed in login page");
	}

	@When("User enter invalid email address {string}")
	public void user_enter_invalid_email_address(String invalidEmaillAddress) {
		System.out.println(" invalid email address is entered: "+invalidEmaillAddress);
	}

	@When("User enter invalid password {string}")
	public void user_enter_invalid_password(String invlaidPassword) {
		System.out.println(">> invalid password entered: "+invlaidPassword);
	}

	@Then("User should get a proper message")
	public void user_should_get_a_proper_message() {
		System.out.println(">> your username or password is invalid");
	}

	@When("User do not enter credentials")
	public void user_do_not_enter_credentials() {
		System.out.println(">> No credentials has been fined");
	}

}
