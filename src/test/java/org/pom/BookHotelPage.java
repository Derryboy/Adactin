package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass{
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expiryYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(name="book_now")
	private WebElement bookNowButton;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditCardNo() {
		return creditCardNo;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBookNowButton() {
		return bookNowButton;
	}
	

}
