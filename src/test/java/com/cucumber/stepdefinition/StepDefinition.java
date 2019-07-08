package com.cucumber.stepdefinition;

import org.junit.Assert;



import com.baseclass.test.BaseclassMaven;

import com.helper.FileReadermanager;
import com.helper.pageobjectmanager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;




public class StepDefinition extends BaseclassMaven{
	//public static WebDriver driver=TestRunner.driver;
	pageobjectmanager po=new pageobjectmanager(driver);
	
	
	@Given("^User launch the adatin hotel application$")
	public void user_launch_the_adatin_hotel_application() throws Throwable {
	    String url=FileReadermanager.getInstance().getCr().getUrl();
getUrl(url);
	}

	@Given("^User enter the email address \"([^\"]*)\" in the authentication page$")
	public void user_enter_the_email_address_in_the_authentication_page(String arg1) throws Throwable {
	 inputValuestoElement(po.getLp().getUsername(), getValuesFromExcel(4, 1));
	}

	@Given("^User enter the password \"([^\"]*)\" in the authentication page$")
	public void user_enter_the_password_in_the_authentication_page(String arg1) throws Throwable {
	  inputValuestoElement(po.getLp().getPassword(), getValuesFromExcel(4, 2));
	}

	@Given("^User click on the signIn button$")
	public void user_click_on_the_signIn_button() throws Throwable {
	   clickOnElement(po.getLp().getLogin());
	}


	@Given("^user select option the location as \"([^\"]*)\"$")
	public void user_select_option_the_location_as(String arg1) throws Throwable {
	 selectOptionFromDropDown(po.getFt().getSelectlocation(), arg1, "visibleText");
	}

	@Given("^user select option the hotel as \"([^\"]*)\"$")
	public void user_select_option_the_hotel_as(String arg1) throws Throwable {
		 selectOptionFromDropDown(po.getFt().getSeletcHotels(), arg1, "visibleText");
	}

	@Given("^user select option the roomtype as \"([^\"]*)\"$")
	public void user_select_option_the_roomtype_as(String arg1) throws Throwable {
		 selectOptionFromDropDown(po.getFt().getSelectroomtype(), arg1, "visibleText");

	}

	@Given("^user select option the noofroom as \"([^\"]*)\"$")
	public void user_select_option_the_noofroom_as(String arg1) throws Throwable {
		 selectOptionFromDropDown(po.getFt().getSelectroomno(), arg1, "visibleText");

	}

	@Given("^user select option the checkin date as \"([^\"]*)\"$")
	public void user_select_option_the_checkin_date_as(String arg1) throws Throwable {
	   elementclear(po.getFt().getSelectindate(), arg1);
	   inputValuestoElement(po.getFt().getSelectindate(), arg1);

	}

	@Given("^user select the option checkoutdate as \"([^\"]*)\"$")
	public void user_select_the_option_checkoutdate_as(String arg1) throws Throwable {
	   
		 elementclear(po.getFt().getSelectoutdate(), arg1);
		   inputValuestoElement(po.getFt().getSelectoutdate(), arg1);
	}
	@Given("^user enter the no of adult \"([^\"]*)\"$")
	public void user_enter_the_no_of_adult(String arg1) throws Throwable {
		   selectOptionFromDropDown(po.getFt().getAdultperroom(), arg1, "visibleText");
			 
	}

	@Given("^user enter th no of children \"([^\"]*)\"$")
	public void user_enter_th_no_of_children(String arg1) throws Throwable {
	    selectOptionFromDropDown(po.getFt().getChildrenperroom(), arg1, "visibleText");
	    
	}

	@Given("^user Enter the seach button$")
	public void user_Enter_the_seach_button() throws Throwable {
	   clickOnElement(po.getFt().getSubmitbutton());

	}

	@Then("^user verify the sysytem error saying check in date should not lesser then check out date$")
	public void user_verify_the_sysytem_error_saying_check_in_date_should_not_lesser_then_check_out_date() throws Throwable {
	 Assert.assertEquals("Check-In Date shall be before than Check-Out Date", getTextOfTheElement(po.getFt().getCheckin_alert()));
	 Assert.assertEquals("Check-Out Date shall be after than Check-In Date", getTextOfTheElement(po.getFt().getCheckout_alert()));
	}
	@Then("^Verify that application throws error message$")
	public void verify_that_application_throws_error_message() throws Throwable {
		Assert.assertEquals("Check-In Date shall be before than Check-Out Date", getTextOfTheElement(po.getFt().getCheckin_alert()));
		 Assert.assertEquals("Check-Out Date shall be after than Check-In Date", getTextOfTheElement(po.getFt().getCheckout_alert()));
	}
	@Then("^user verify whether Location displayed in Select Hotel is same as location selected in search hotel form\\.$")
	public void user_verify_whether_Location_displayed_in_Select_Hotel_is_same_as_location_selected_in_search_hotel_form() throws Throwable {

		
		System.out.println(getAttributeOfTheElement(po.getSp().getHotellocation()));
Assert.assertEquals("Melbourne", getAttributeOfTheElement(po.getSp().getHotellocation()));
	}
	
	@Then("^Verify that check-indate and check-outdates are the same as selected in search hotel form\\.$")
	public void verify_that_check_indate_and_check_outdates_are_the_same_as_selected_in_search_hotel_form() throws Throwable {
	    System.out.println(getAttributeOfTheElement(po.getSp().getHotelarrivedate()));
	 
		Assert.assertEquals("02/07/2019", getAttributeOfTheElement(po.getSp().getHotelarrivedate()));
		   System.out.println(getAttributeOfTheElement(po.getSp().getHoteldepatdate()));
		   Assert.assertEquals("03/07/2019", getAttributeOfTheElement(po.getSp().getHoteldepatdate()));
	}

	@Then("^Verify that no-ofrooms is reflected according to the number of rooms selected in search hotel page\\.$")
	public void verify_that_no_ofrooms_is_reflected_according_to_the_number_of_rooms_selected_in_search_hotel_page() throws Throwable {
	  System.out.println(getAttributeOfTheElement(po.getSp().getHotel_rooms()));
		Assert.assertEquals("2 Rooms", getAttributeOfTheElement(po.getSp().getHotel_rooms()));
	}
	@Then("^user Verify that room type reflected is the same as selected in search hotel page\\.$")
	public void user_Verify_that_room_type_reflected_is_the_same_as_selected_in_search_hotel_page() throws Throwable {
		driver.switchTo().defaultContent();
		System.out.println(getAttributeOfTheElement(po.getSp().getHotel_roomtype()));
		Assert.assertEquals("Standard", getAttributeOfTheElement(po.getSp().getHotel_roomtype()));
	}
	
	@Then("^Verify that totalprice\\(excl\\.GST\\) is being calculated as \\(price-per-night\\*noof-rooms\\*no-of-days\\)$")
	public void verify_that_totalprice_excl_GST_is_being_calculated_as_price_per_night_noof_rooms_no_of_days() throws Throwable {
	                 System.out.println(getAttributeOfTheElement(po.getSp().getTotalprice()));   
	                 Assert.assertEquals("AUD $ 185", getAttributeOfTheElement(po.getSp().getTotalprice()));
	   	}
	
	
	@Given("^user select the hotel$")
	public void user_select_the_hotel() throws Throwable {
	clickOnElement(po.getSp().getRadiobutton());  
	}

	

	@Given("^user click on the continue button$")
	public void user_click_on_the_continue_button() throws Throwable {
	    
	    clickOnElement(po.getSp().getContinuebutton());
	}

	@Given("^user enter the first name \"([^\"]*)\" in htoel booking page$")
	public void user_enter_the_first_name_in_htoel_booking_page(String arg1) throws Throwable {
	    
	    inputValuestoElement(po.getSp().getFirstname(), arg1);
	}

	@Given("^user enter the last name \"([^\"]*)\" in hotel booking page$")
	public void user_enter_the_last_name_in_hotel_booking_page(String arg1) throws Throwable {
	    
	    inputValuestoElement(po.getSp().getLastname(), arg1);
	}

	@Given("^user enter the billing adrress \"([^\"]*)\" in hotel booking page$")
	public void user_enter_the_billing_adrress_in_hotel_booking_page(String arg1) throws Throwable {
	    
	    inputValuestoElement(po.getSp().getAddress(), arg1);
	}

	@Given("^user enter the credit card no \"([^\"]*)\"in the hotel booking page$")
	public void user_enter_the_credit_card_no_in_the_hotel_booking_page(String arg1) throws Throwable {
	    inputValuestoElement(po.getSp().getCreaditcardno(), arg1);
	    
	}

	@Given("^user select the credit card type \"([^\"]*)\" in htoel booking page$")
	public void user_select_the_credit_card_type_in_htoel_booking_page(String arg1) throws Throwable {
	    selectOptionFromDropDown(po.getSp().getCreditcardtype(), arg1, "visibleText");
	    
	}

	@Given("^user select the expiry month \"([^\"]*)\" in the hotel booking page$")
	public void user_select_the_expiry_month_in_the_hotel_booking_page(String arg1) throws Throwable {
		selectOptionFromDropDown(po.getSp().getExpmonth(), arg1, "visibleText"); 
	    
	}

	@Given("^user select the expiry year \"([^\"]*)\" in the hotel booking page$")
	public void user_select_the_expiry_year_in_the_hotel_booking_page(String arg1) throws Throwable {
	    
		selectOptionFromDropDown(po.getSp().getExpyear(), arg1, "visibleText");
	}

	@Given("^user enter the cvv number \"([^\"]*)\" in the hotel booking page$")
	public void user_enter_the_cvv_number_in_the_hotel_booking_page(String arg1) throws Throwable {
	    inputValuestoElement(po.getSp().getCvvnumber(), arg1);
	    
	}

	@Given("^user click on the booknow button$")
	public void user_click_on_the_booknow_button() throws Throwable {
		clickOnElement(po.getSp().getBooknow());
	    
	}

	@Given("^user check the details, and logout$")
	public void user_check_the_details_and_logout() throws Throwable {
	    
	    clickOnElement(po.getBp().getLogout());
	}
//tc109
	@Then("^Check the details, click on logout and verify we have been logged out of the application\\.$")
	public void check_the_details_click_on_logout_and_verify_we_have_been_logged_out_of_the_application() throws Throwable {
	    Assert.assertEquals("You have successfully logged out. Click here to login again",getTextOfTheElement(po.getBp().getGetlogutfunction()));
	    
	}
	
	//@Tc110
	@Then("^Verify that total-price is being calculated as \\(price-pernight\\*no-ofrooms\\*no-of-days \\+ (\\d+)% GST”\\)$")
	public void verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days_GST(int arg1) throws Throwable {
	    
	    
	}

	@Then("^VVerify that total-price is  being calculated as \\(priceper- night\\*no-ofrooms\\*no-of-days\\)$")
	public void vverify_that_total_price_is_being_calculated_as_priceper_night_no_ofrooms_no_of_days() throws Throwable {
	    
	    
	}

	@Then("^Verify that total-price final bill is being calculated as \\(price-pernight\\*no-ofrooms\\*no-of-days$")
	public void verify_that_total_price_final_bill_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days() throws Throwable {
	    
	    
	}

	@Then("^Verify that total-price is being calculated as \\(priceper-night\\*no-ofrooms\\*no-of-days$")
	public void verify_that_total_price_is_being_calculated_as_priceper_night_no_ofrooms_no_of_days() throws Throwable {
	    
	    
	}

	@Then("^Verify that total-price calculated as \\(price-pernight\\*no-ofrooms\\*no-of-days$")
	public void verify_that_total_price_calculated_as_price_pernight_no_ofrooms_no_of_days() throws Throwable {
	    
	    
	}

	@Then("^check and verify that total-price is being calculated as \\(price-pernight\\*no-ofrooms\\*no-of-days$")
	public void check_and_verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days() throws Throwable {
	    
	    
	}

	@Then("^Verify that the details are not editable$")
	public void verify_that_the_details_are_not_editable() throws Throwable {
	    
	    
	}

	@Then("^Verify that the details are reflected correctly as per the booking$")
	public void verify_that_the_details_are_reflected_correctly_as_per_the_booking() throws Throwable {
	    
	    
	}

	@Then("^Verify that the relevant details are displayed$")
	public void verify_that_the_relevant_details_are_displayed() throws Throwable {
	    
	    
	}

	@Then("^Verify all the details of order number are correct as entered during saving order$")
	public void verify_all_the_details_of_order_number_are_correct_as_entered_during_saving_order() throws Throwable {
	    
	    
	}

	@Then("^Verify that order number is cancelled and now longer exists in Booked Itinerary page$")
	public void verify_that_order_number_is_cancelled_and_now_longer_exists_in_Booked_Itinerary_page() throws Throwable {
	    
	    
	}

	@Then("^Click on booked itinerary button and verify that application directs to booked itinerary form$")
	public void click_on_booked_itinerary_button_and_verify_that_application_directs_to_booked_itinerary_form() throws Throwable {
	    
	    
	}
	
	
}




	

