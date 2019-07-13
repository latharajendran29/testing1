package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingconifrmpage {
	public WebDriver driver;
	public  Bookingconifrmpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
	@FindBy(xpath="//td[contains(text(),'You have successfully logged out.')]")
	private WebElement getlogutfunction;
	public WebElement getGetlogutfunction() {
		return getlogutfunction;
	}
	
}
