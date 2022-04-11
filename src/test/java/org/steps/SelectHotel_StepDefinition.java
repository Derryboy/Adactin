package org.steps;

import org.openqa.selenium.WebElement;
import org.pom.BaseClass;
import org.pom.SelectHotelPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectHotel_StepDefinition extends BaseClass{
	@Given("User clicks select button")
	public void user_clicks_select_button() {
	    SelectHotelPage sp = new SelectHotelPage();
	    
	    WebElement selectButton = sp.getSelectButton();
		buttonClick(selectButton);
	}

	@And("User clicks continue button")
	public void user_clicks_continue_button() {
		SelectHotelPage sp = new SelectHotelPage();
		
		WebElement continueButton = sp.getContinueButton();
		buttonClick(continueButton);
	}

	@Then("User navigates to Book A Hotel page")
	public void user_navigates_to_Book_A_Hotel_page() {
	    System.out.println("Successfully navigated to Book A Hotel Page");
	}

}
