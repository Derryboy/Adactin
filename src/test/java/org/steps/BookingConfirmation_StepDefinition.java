package org.steps;

import org.pom.BaseClass;
import org.pom.BookingConfirmationPage;

import cucumber.api.java.en.Given;

public class BookingConfirmation_StepDefinition extends BaseClass {
	@Given("User clicks logout button")
	public void user_clicks_logout_button() {
	    BookingConfirmationPage bcp = new BookingConfirmationPage();
	    
	    buttonClick(bcp.getLogoutButton());
	}
}
