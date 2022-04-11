package org.steps;

import org.openqa.selenium.WebElement;
import org.pom.BaseClass;
import org.pom.SearchHotelPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotel_StepDefinition extends BaseClass{
	
	@Given("User enters all the mandatory fields")
	public void user_enters_all_the_mandatory_fields() {
	    SearchHotelPage shp = new SearchHotelPage();
	    
	    WebElement location = shp.getLocation();
	    selectByIndex(location, 2);
	    
	    WebElement numberOfRooms = shp.getNumberOfRooms();
		selectByIndex(numberOfRooms, 5);
		
		WebElement checkInDate = shp.getCheckInDate();
		checkInDate.clear();
		enterDate(checkInDate, "05/04/2022");
		
		WebElement checkOutDate = shp.getCheckOutDate();
		checkOutDate.clear();
		enterDate(checkOutDate, "10/04/2022");
		
		WebElement adultsPerRoom = shp.getAdultsPerRoom();
		selectByIndex(adultsPerRoom, 2);
	}
	
	/*@Given("User enters all the mandatory fields location {int} numberOfRooms {int} checkInDate{string} checkOutDate{string} adultsPerRoom {int}")
	public void user_enters_all_the_mandatory_fields_location_numberOfRooms_checkInDate_checkOutDate_adultsPerRoom(Integer locationf, Integer numberOfRoomsf, String checkInDatef, String checkOutDatef, Integer adultsPerRoomf) {
		SearchHotelPage shp = new SearchHotelPage();
	    
	    WebElement location = shp.getLocation();
	    selectByIndex(location, locationf);
	    
	    WebElement numberOfRooms = shp.getNumberOfRooms();
		selectByIndex(numberOfRooms, numberOfRoomsf);
		
		WebElement checkInDate = shp.getCheckInDate();
		checkInDate.clear();
		enterDate(checkInDate, checkInDatef);
		
		WebElement checkOutDate = shp.getCheckOutDate();
		checkOutDate.clear();
		enterDate(checkOutDate, checkOutDatef);
		
		WebElement adultsPerRoom = shp.getAdultsPerRoom();
		selectByIndex(adultsPerRoom, adultsPerRoomf);
	}*/

	@When("User enters other fields if required")
	public void user_enters_other_fields_if_required() {
		SearchHotelPage shp = new SearchHotelPage();
		
		WebElement hotels = shp.getHotels();
		selectByValue(hotels, "Hotel Hervey");
		
		WebElement roomType = shp.getRoomType();
		selectByVisibleText(roomType, "Super Deluxe");
		
		WebElement childrensPerRoom = shp.getChildrensPerRoom();
		selectByValue(childrensPerRoom, "4");
	}
	
	/*@When("User enters other fields if required hotels {string} roomType {string} childrensPerRoom {string}")
	public void user_enters_other_fields_if_required_hotels_roomType_childrensPerRoom(String hotelsf, String roomTypef, String childrensPerRoomf) {
		SearchHotelPage shp = new SearchHotelPage();
		
		WebElement hotels = shp.getHotels();
		selectByValue(hotels, hotelsf);
		
		WebElement roomType = shp.getRoomType();
		selectByVisibleText(roomType, roomTypef);
		
		WebElement childrensPerRoom = shp.getChildrensPerRoom();
		selectByValue(childrensPerRoom, childrensPerRoomf);
	}*/

	@And("User clicks the search button")
	public void user_clicks_the_search_button() {
		SearchHotelPage shp = new SearchHotelPage();
		
		buttonClick(shp.getSearchButton());
	}

	@Then("User navigates to Select Hotel page")
	public void user_navigates_to_Select_Hotel_page() {
	    System.out.println("Successfully navigated to Select Hotel Page");
	}

}
