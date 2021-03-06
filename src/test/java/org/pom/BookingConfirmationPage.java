package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass{
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logout")
	private WebElement logoutButton;

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
}
