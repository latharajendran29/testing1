package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelFirstTestcase {
	
	public WebDriver driver;
	public  HotelFirstTestcase(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@name='location']")
	private WebElement selectlocation;
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement seletcHotels;
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement selectroomtype;
	@FindBy(xpath = "//select[@name='room_nos']")
	private WebElement selectroomno;
	@FindBy(xpath="//input[@id='datepick_in']")
private WebElement selectindate;
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement selectoutdate;
	@FindBy(id="adult_room")
	private WebElement adultperroom;
	@FindBy(id="child_room")
	private WebElement childrenperroom;
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submitbutton;
	
	
	
	public WebElement getSelectlocation() {
		return selectlocation;
	}
	public WebElement getSeletcHotels() {
		return seletcHotels;
	}
	public WebElement getSelectroomtype() {
		return selectroomtype;
	}
	public WebElement getSelectroomno() {
		return selectroomno;
	}
	public WebElement getSelectindate() {
		return selectindate;
	}
	public WebElement getSelectoutdate() {
		return selectoutdate;
	}
	public WebElement getAdultperroom() {
		return adultperroom;
	}
	public WebElement getChildrenperroom() {
		return childrenperroom;
	}
	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	@FindBy(xpath="//span[@id='checkin_span']")
	private WebElement checkin_alert;
	@FindBy(xpath="//span[@id='checkout_span']")
	private WebElement checkout_alert;
	public WebElement getCheckin_alert() {
		return checkin_alert;
	}
	public WebElement getCheckout_alert() {
		return checkout_alert;
	}

	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	
	
	
	
}
