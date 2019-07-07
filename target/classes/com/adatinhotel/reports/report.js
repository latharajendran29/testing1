$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adatinhotelendtoend.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin hotle application end to end testing",
  "description": "Test scenarios includes Login, Search, hotelroom booking,... etc",
  "id": "adactin-hotle-application-end-to-end-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Verify the login functionality of the application",
  "description": "",
  "id": "adactin-hotle-application-end-to-end-testing;verify-the-login-functionality-of-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC_101"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User launch the adatin hotel application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enter the email address \"vinothlatha\" in the authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enter the password \"viha123\" in the authentication page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on the signIn button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adatin_hotel_application()"
});
formatter.result({
  "duration": 2165825000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinothlatha",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_enter_the_email_address_in_the_authentication_page(String)"
});
formatter.result({
  "duration": 1071764200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "viha123",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_password_in_the_authentication_page(String)"
});
formatter.result({
  "duration": 293488100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_signIn_button()"
});
formatter.result({
  "duration": 893323100,
  "status": "passed"
});
formatter.uri("adatinhotelendtoend2.feature");
formatter.feature({
  "line": 2,
  "name": "Adactin hotle application end to end testing",
  "description": "Test scenarios includes Login, Search, hotelroom booking,... etc",
  "id": "adactin-hotle-application-end-to-end-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@demo1"
    }
  ]
});
formatter.scenario({
  "line": 31,
  "name": "To check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page",
  "description": "",
  "id": "adactin-hotle-application-end-to-end-testing;to-check-correct-total-price-is-being-calculated-as-“price-per-night*no-of-days*no-of-rooms-in-book-a-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@TC_110"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "user select option the location as \"Melbourne\"",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "user select option the hotel as \"Hotel Sunshine\"",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user select option the roomtype as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user select option the noofroom as \"2 - Two\"",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user select option the checkin date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user select the option checkoutdate as \"03/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user enter the no of adult \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user enter th no of children \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter the seach button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user enter the first name \"latha\" in htoel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user enter the last name \"vinoth\" in hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user enter the billing adrress \"villivakkam\" in hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user enter the credit card no \"9587364587651234\"in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user select the credit card type \"Master Card\" in htoel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user select the expiry month \"April\" in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user select the expiry year \"2022\" in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user enter the cvv number \"123\" in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user click on the booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Verify that total-price is being calculated as (price-pernight*no-ofrooms*no-of-days + 10% GST”)",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Melbourne",
      "offset": 36
    }
  ],
  "location": "StepDefinition.user_select_option_the_location_as(String)"
});
formatter.result({
  "duration": 242686300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hotel Sunshine",
      "offset": 33
    }
  ],
  "location": "StepDefinition.user_select_option_the_hotel_as(String)"
});
formatter.result({
  "duration": 199980700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Standard",
      "offset": 36
    }
  ],
  "location": "StepDefinition.user_select_option_the_roomtype_as(String)"
});
formatter.result({
  "duration": 194145100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 36
    }
  ],
  "location": "StepDefinition.user_select_option_the_noofroom_as(String)"
});
formatter.result({
  "duration": 198901000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "02/07/2019",
      "offset": 40
    }
  ],
  "location": "StepDefinition.user_select_option_the_checkin_date_as(String)"
});
formatter.result({
  "duration": 387511700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "03/07/2019",
      "offset": 40
    }
  ],
  "location": "StepDefinition.user_select_the_option_checkoutdate_as(String)"
});
formatter.result({
  "duration": 381853800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 28
    }
  ],
  "location": "StepDefinition.user_enter_the_no_of_adult(String)"
});
formatter.result({
  "duration": 166366800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_enter_th_no_of_children(String)"
});
formatter.result({
  "duration": 218502000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_the_seach_button()"
});
formatter.result({
  "duration": 774779700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_hotel()"
});
formatter.result({
  "duration": 219119200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_continue_button()"
});
formatter.result({
  "duration": 744816200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "latha",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_first_name_in_htoel_booking_page(String)"
});
formatter.result({
  "duration": 232499700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vinoth",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_enter_the_last_name_in_hotel_booking_page(String)"
});
formatter.result({
  "duration": 207062500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "villivakkam",
      "offset": 32
    }
  ],
  "location": "StepDefinition.user_enter_the_billing_adrress_in_hotel_booking_page(String)"
});
formatter.result({
  "duration": 243219200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9587364587651234",
      "offset": 31
    }
  ],
  "location": "StepDefinition.user_enter_the_credit_card_no_in_the_hotel_booking_page(String)"
});
formatter.result({
  "duration": 279164200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Master Card",
      "offset": 34
    }
  ],
  "location": "StepDefinition.user_select_the_credit_card_type_in_htoel_booking_page(String)"
});
formatter.result({
  "duration": 210497200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "April",
      "offset": 30
    }
  ],
  "location": "StepDefinition.user_select_the_expiry_month_in_the_hotel_booking_page(String)"
});
formatter.result({
  "duration": 194880600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022",
      "offset": 29
    }
  ],
  "location": "StepDefinition.user_select_the_expiry_year_in_the_hotel_booking_page(String)"
});
formatter.result({
  "duration": 195492100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 27
    }
  ],
  "location": "StepDefinition.user_enter_the_cvv_number_in_the_hotel_booking_page(String)"
});
formatter.result({
  "duration": 181098900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_booknow_button()"
});
formatter.result({
  "duration": 163183600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 87
    }
  ],
  "location": "StepDefinition.verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days_GST(int)"
});
formatter.result({
  "duration": 150684620300,
  "error_message": "java.lang.RuntimeException\r\n\tat com.baseclass.test.BaseclassMaven.waitforElementVisiblity(BaseclassMaven.java:80)\r\n\tat com.baseclass.test.BaseclassMaven.getAttributeOfTheElement(BaseclassMaven.java:302)\r\n\tat com.cucumber.stepdefinition.StepDefinition.verify_that_total_price_is_being_calculated_as_price_pernight_no_ofrooms_no_of_days_GST(StepDefinition.java:225)\r\n\tat ✽.Then Verify that total-price is being calculated as (price-pernight*no-ofrooms*no-of-days + 10% GST”)(adatinhotelendtoend2.feature:52)\r\n",
  "status": "failed"
});
});