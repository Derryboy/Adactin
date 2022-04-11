package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@name='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement numberOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(name="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(name="child_room")
	private WebElement childrensPerRoom;
	
	@FindBy(name="Submit")
	private WebElement searchButton;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrensPerRoom() {
		return childrensPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
	
	
}
