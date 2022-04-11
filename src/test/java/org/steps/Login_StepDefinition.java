package org.steps;

import org.pom.BaseClass;
import org.pom.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition extends BaseClass{
	
	@Given("User launches the adactin url")
	public void user_launches_the_adactin_url() {
	   browserLaunch("http://adactinhotelapp.com/");
	}

	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
		LoginPage lp = new LoginPage();
		
	    enterText(lp.getUsername(), "derrick0001");
	    enterText(lp.getPassword(), "qwerty123");
	}
	
	/*@When("User enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		LoginPage lp = new LoginPage();
		
	    enterText(lp.getUsername(), username);
	    enterText(lp.getPassword(), password);
	}*/
	
	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
	   LoginPage lp = new LoginPage();
	   
	   buttonClick(lp.getLogin());
	}

	@Then("User navigates to Search Hotel page")
	public void user_navigates_to_Search_Hotel_page() {
	   System.out.println("Successfully navigated to Search Hotel Page");
	}

}
