package org.steps;


import org.pom.BaseClass;
import org.pom.BookHotelPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BookHotel_StepDefinition extends BaseClass {
	@Given("User enters all the fields marked with asterix")
	public void user_enters_all_the_fields_marked_with_asterix() {
		BookHotelPage bp = new BookHotelPage();
		
		enterText(bp.getFirstName(), "Derrick");
		enterText(bp.getLastName(), "Antony");
		enterText(bp.getBillingAddress(), "No:111, Tambaram, Chennai");
		enterText(bp.getCreditCardNo(), "1234567899874561");
		selectByValue(bp.getCreditCardType(), "AMEX");
		selectByIndex(bp.getExpiryMonth(), 5);
		selectByVisibleText(bp.getExpiryYear(), "2022");
		enterText(bp.getCvvNumber(), "123");
	}

	@And("User clicks book now button")
	public void user_clicks_book_now_button() {
		BookHotelPage bp = new BookHotelPage();
		
		buttonClick(bp.getBookNowButton());
	}

	@Then("User navigates to Booking Confirmation page")
	public void user_navigates_to_Booking_Confirmation_page() {
		System.out.println("Successfully navigated to Booking Confirmation Page");
	}
}
