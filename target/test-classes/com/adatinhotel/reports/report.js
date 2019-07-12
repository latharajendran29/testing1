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
  "duration": 3763555100,
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
  "duration": 1383237600,
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
  "duration": 333108600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_signIn_button()"
});
formatter.result({
  "duration": 1754926100,
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
  "line": 169,
  "name": "To verify whether the booked itinerary details are not editable.",
  "description": "",
  "id": "adactin-hotle-application-end-to-end-testing;to-verify-whether-the-booked-itinerary-details-are-not-editable.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 168,
      "name": "@TC_115"
    }
  ]
});
formatter.step({
  "line": 170,
  "name": "user select option the location as \"Melbourne\"",
  "keyword": "Given "
});
formatter.step({
  "line": 171,
  "name": "user select option the hotel as \"Hotel Sunshine\"",
  "keyword": "And "
});
formatter.step({
  "line": 172,
  "name": "user select option the roomtype as \"Standard\"",
  "keyword": "And "
});
formatter.step({
  "line": 173,
  "name": "user select option the noofroom as \"2 - Two\"",
  "keyword": "And "
});
formatter.step({
  "line": 174,
  "name": "user select option the checkin date as \"02/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 175,
  "name": "user select the option checkoutdate as \"03/07/2019\"",
  "keyword": "And "
});
formatter.step({
  "line": 176,
  "name": "user enter the no of adult \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 177,
  "name": "user enter th no of children \"1 - One\"",
  "keyword": "And "
});
formatter.step({
  "line": 178,
  "name": "user Enter the seach button",
  "keyword": "And "
});
formatter.step({
  "line": 179,
  "name": "user select the hotel",
  "keyword": "And "
});
formatter.step({
  "line": 180,
  "name": "user click on the continue button",
  "keyword": "And "
});
formatter.step({
  "line": 181,
  "name": "user enter the first name \"latha\" in htoel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 182,
  "name": "user enter the last name \"vinoth\" in hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 183,
  "name": "user enter the billing adrress \"villivakkam\" in hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 184,
  "name": "user enter the credit card no \"9587364587651234\"in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 185,
  "name": "user select the credit card type \"Master Card\" in htoel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 186,
  "name": "user select the expiry month \"April\" in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 187,
  "name": "user select the expiry year \"2022\" in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 188,
  "name": "user enter the cvv number \"123\" in the hotel booking page",
  "keyword": "And "
});
formatter.step({
  "line": 189,
  "name": "user click on the booknow button",
  "keyword": "And "
});
formatter.step({
  "line": 190,
  "name": "Click on My itinerary button",
  "keyword": "And "
});
formatter.step({
  "line": 191,
  "name": "Verify that the details are not editable",
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
  "duration": 224513800,
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
  "duration": 213712900,
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
  "duration": 217764400,
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
  "duration": 184326800,
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
  "duration": 393064600,
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
  "duration": 367927600,
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
  "duration": 146702700,
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
  "duration": 171953200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_Enter_the_seach_button()"
});
formatter.result({
  "duration": 1505069300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_select_the_hotel()"
});
formatter.result({
  "duration": 175107700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_continue_button()"
});
formatter.result({
  "duration": 2396494000,
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
  "duration": 217308100,
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
  "duration": 202592000,
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
  "duration": 226407400,
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
  "duration": 247802600,
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
  "duration": 173021900,
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
  "duration": 171962600,
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
  "duration": 177193100,
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
  "duration": 175022000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_on_the_booknow_button()"
});
formatter.result({
  "duration": 135802300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.click_on_My_itinerary_button()"
});
formatter.result({
  "duration": 59375237200,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
});