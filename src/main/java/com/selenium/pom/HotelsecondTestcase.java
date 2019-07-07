package com.selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelsecondTestcase {
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement selectindate;
		@FindBy(xpath="//input[@id='datepick_out']")
		private WebElement selectoutdate;
		@FindBy(xpath="//input[@id='Submit']")
		private WebElement submitbutton;
		@FindBy(xpath="//span[@id='checkin_span']")
		private WebElement checkinerrormessage;
		@FindBy(xpath="//span[@id='checkout_span']")
		private WebElement checkouterrormessage;
		public WebElement getSelectindate() {
			return selectindate;
		}
		public void setSelectindate(WebElement selectindate) {
			this.selectindate = selectindate;
		}
		public WebElement getSelectoutdate() {
			return selectoutdate;
		}
		public void setSelectoutdate(WebElement selectoutdate) {
			this.selectoutdate = selectoutdate;
		}
		public WebElement getSubmitbutton() {
			return submitbutton;
		}
		public void setSubmitbutton(WebElement submitbutton) {
			this.submitbutton = submitbutton;
		}
		public WebElement getCheckinerrormessage() {
			return checkinerrormessage;
		}
		public void setCheckinerrormessage(WebElement checkinerrormessage) {
			this.checkinerrormessage = checkinerrormessage;
		}
		public WebElement getCheckouterrormessage() {
			return checkouterrormessage;
		}
		public void setCheckouterrormessage(WebElement checkouterrormessage) {
			this.checkouterrormessage = checkouterrormessage;
		}
		
}
