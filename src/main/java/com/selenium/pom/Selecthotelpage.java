package com.selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Selecthotelpage {
	
	public WebDriver driver;
	public  Selecthotelpage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location_0")
	private WebElement hotellocation;
	public WebElement getHotellocation() {
		return hotellocation;
	}
	@FindBy(id="arr_date_0")
	private WebElement hotelarrivedate;
	@FindBy(id="dep_date_0")
	private WebElement hoteldepatdate;
	public WebElement getHotelarrivedate() {
		return hotelarrivedate;
	}
	public WebElement getHoteldepatdate() {
		return hoteldepatdate;
	}
	
	@FindBy(id="rooms_0")
	private WebElement hotel_rooms;
	public WebElement getHotel_rooms() {
		return hotel_rooms;
	}
	@FindBy(id="room_type_0")
	private WebElement hotel_roomtype;
	public WebElement getHotel_roomtype() {
		return hotel_roomtype;
	}
	@FindBy(xpath="//input[@id='no_days_0']")
	private WebElement hotelnoof_days;
	@FindBy(id="price_night_0")
	private WebElement  hotel_price;
	public WebElement getHotelnoof_days() {
		return hotelnoof_days;
	}
	public WebElement getHotel_price() {
		return hotel_price;
	}
	@FindBy(id="total_price_0")
	private WebElement totalprice;
	public WebElement getTotalprice() {
		return totalprice;
	}
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
private WebElement lastname;
	@FindBy(id="address")
private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creaditcardno;
	@FindBy(id="cc_type")
	private WebElement creditcardtype;
	@FindBy(id="cc_exp_month")
	private WebElement expmonth;
	@FindBy(id="cc_exp_year")
	private WebElement expyear;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCreaditcardno() {
		return creaditcardno;
	}
	public WebElement getCreditcardtype() {
		return creditcardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	
	@FindBy(id="book_now")
	private WebElement booknowbutton;
	public WebElement getBooknowbutton() {
		return booknowbutton;
	}
@FindBy(id="my_itinerary")
private WebElement mylitineray;
@FindBy(xpath="//input[@onkeypress='return Nothingonly(event)']")
private WebElement nothingreturn;
public WebElement getMylitineray() {
	return mylitineray;
}
public WebElement getNothingreturn() {
	return nothingreturn;
}
@FindBy(id="order_no")
private WebElement bookingconfirmorderno;
public WebElement getBookingconfirmorderno() {
	return bookingconfirmorderno;
}
@FindBy(id="order_id_text")
private WebElement serachroderid;
public WebElement getSerachroderid() {
	return serachroderid;
}

@FindBy(id="search_hotel_id")
private WebElement go_button;

public WebElement getGo_button() {
	return go_button;
}

@FindBy(xpath="(//input[@type='checkbox'])[2]")
private WebElement checkbox;

public WebElement getCheckbox() {
	return checkbox;
}



}
