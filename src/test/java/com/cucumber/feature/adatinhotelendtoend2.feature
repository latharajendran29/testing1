@demo1
Feature: Adactin hotle application end to end testing
Test scenarios includes Login, Search, hotelroom booking,... etc


@TC_109
Scenario: To verify whether the check-out date field accepts a later date than checkin date.
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user enter the no of adult "1 - One"
And user enter th no of children "1 - One"
And user Enter the seach button
And user select the hotel
And user click on the continue button
And user enter the first name "latha" in htoel booking page
And user enter the last name "vinoth" in hotel booking page
And user enter the billing adrress "villivakkam" in hotel booking page
And user enter the credit card no "9587364587651234"in the hotel booking page
And user select the credit card type "Master Card" in htoel booking page
And user select the expiry month "April" in the hotel booking page
And user select the expiry year "2022" in the hotel booking page
And user enter the cvv number "123" in the hotel booking page
And user click on the booknow button
And user check the details, and logout
Then  Check the details, click on logout and verify we have been logged out of the application.
@TC_110
Scenario: To check correct total price is being calculated as “price per night*no of days*no of rooms in Book a hotel page
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user enter the no of adult "1 - One"
And user enter th no of children "1 - One"
And user Enter the seach button
And user select the hotel
And user click on the continue button
And user enter the first name "latha" in htoel booking page
And user enter the last name "vinoth" in hotel booking page
And user enter the billing adrress "villivakkam" in hotel booking page
And user enter the credit card no "9587364587651234"in the hotel booking page
And user select the credit card type "Master Card" in htoel booking page
And user select the expiry month "April" in the hotel booking page
And user select the expiry year "2022" in the hotel booking page
And user enter the cvv number "123" in the hotel booking page
And user click on the booknow button
Then  Verify that total-price is being calculated as (price-pernight*no-ofrooms*no-of-days + 10% GST”)
@TC_111
Scenario: To check Hotel name, Location, room type, Total Day, price per night are same in Booking confirmation page as they were selected in previous screen
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user enter the no of adult "1 - One"
And user enter th no of children "1 - One"
And user Enter the seach button
And user select the hotel
And user click on the continue button
And user enter the first name "latha" in htoel booking page
And user enter the last name "vinoth" in hotel booking page
And user enter the billing adrress "villivakkam" in hotel booking page
And user enter the credit card no "9587364587651234"in the hotel booking page
And user select the credit card type "Master Card" in htoel booking page
And user select the expiry month "April" in the hotel booking page
And user select the expiry year "2022" in the hotel booking page
And user enter the cvv number "123" in the hotel booking page
And user click on the booknow button
Then VVerify that total-price is  being calculated as (priceper- night*no-ofrooms*no-of-days)
@TC_112
Scenario: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user enter the no of adult "1 - One"
And user enter th no of children "1 - One"
And user Enter the seach button
And user select the hotel
And user click on the continue button
And user enter the first name "latha" in htoel booking page
And user enter the last name "vinoth" in hotel booking page
And user enter the billing adrress "villivakkam" in hotel booking page
And user enter the credit card no "9587364587651234"in the hotel booking page
And user select the credit card type "Master Card" in htoel booking page
And user select the expiry month "April" in the hotel booking page
And user select the expiry year "2022" in the hotel booking page
And user enter the cvv number "123" in the hotel booking page
And user click on the booknow button
Then  Verify that total-price final bill is being calculated as (price-pernight*no-ofrooms*no-of-days
@TC_113
Scenario: To verify whether the data displayed is same as the selected data in Book hotel page
Given user select option the location as "Melbourne" 
And user select option the hotel as "Hotel Sunshine"
And user select option the roomtype as "Standard"
And user select option the noofroom as "2 - Two"
And user select option the checkin date as "02/07/2019"
And user select the option checkoutdate as "03/07/2019"
And user enter the no of adult "1 - One"
And user enter th no of children "1 - One"
And user Enter the seach button
And user select the hotel
And user click on the continue button
And user enter the first name "latha" in htoel booking page
And user enter the last name "vinoth" in hotel booking page
And user enter the billing adrress "villivakkam" in hotel booking page
And user enter the credit card no "9587364587651234"in the hotel booking page
And user select the credit card type "Master Card" in htoel booking page
And user select the expiry month "April" in the hotel booking page
And user select the expiry year "2022" in the hotel booking page
And user enter the cvv number "123" in the hotel booking page
And user click on the booknow button
Then  Verify that total-price is being calculated as (priceper-night*no-ofrooms*no-of-days


)

