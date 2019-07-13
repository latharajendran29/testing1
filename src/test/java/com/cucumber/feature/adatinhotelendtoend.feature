Feature: Adactin hotle application end to end testing
Test scenarios includes Login, Search, hotelroom booking,... etc

@TC_101
Scenario:  Verify the login functionality of the application 
Given User launch the adatin hotel application
And User enter the email address "vinothlatha" in the authentication page
And User enter the password "viha123" in the authentication page
And User click on the signIn button
@TC_102
Scenario: To verify whether the check-out date field accepts a later date than checkin date.
Given user select option the location as "Melbourne" 
And user select option the h -otel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "29/06/2019"
And user Enter the seach button
Then user verify the sysytem error saying check in date should not lesser then check out date
@TC_103
Scenario: To check if error is reported if check-out date field is in the past
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "21/06/2019"
And user select the option checkoutdate as "23/06/2019"
And user Enter the seach button
Then Verify that application throws error message
@TC_104
Scenario: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
Given user select option the location as "Melbourne"
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "01/07/2019"
And user select the option checkoutdate as "02/07/2019"
And user Enter the seach button
Then user verify whether Location displayed in Select Hotel is same as location selected in search hotel form.
@TC_105
Scenario: date and Check Out date are being displayed in Select Hotel page according to the dates selected in search Hotel.
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user Enter the seach button
Then Verify that check-indate and check-outdates are the same as selected in search hotel form.
@TC_106
Scenario: To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
Given user select option the location as "Melbourne"
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user Enter the seach button
Then Verify that no-ofrooms is reflected according to the number of rooms selected in search hotel page.
@TC_107
Scenario: To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user Enter the seach button
Then user Verify that room type reflected is the same as selected in search hotel page.
@TC_108
Scenario: To verify whether the total price (excl.GST) is calculated as “price per night * no. of nights* no of rooms”.
Given user select option the location as "Melbourne"
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "28/06/2019"
And user select the option checkoutdate as "29/06/2019"
And user Enter the seach button
Then Verify that totalprice(excl.GST) is being calculated as (price-per-night*noof-rooms*no-of-days)


