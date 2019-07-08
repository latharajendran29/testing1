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
Then Verify that total-price is being calculated as (priceper-night*no-ofrooms*no-of-days
@TC_114
Scenario: Verify Order number is generated in booking confirmation page
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
Then Verify that total-price calculated as (price-pernight*no-ofrooms*no-of-days
@TC_114
Scenario: Verify Order number is generated in booking confirmation page
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
Then  check and verify that total-price is being calculated as (price-pernight*no-ofrooms*no-of-days
@TC_115
Scenario: To verify whether the booked itinerary details are not editable.
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
Then  Verify that the details are not editable
@TC_116
Scenario: To check whether the booked itinerary reflects the correct information in line with the booking.
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
Then Verify that the details are reflected correctly as per the booking
@TC_117
Scenario: To check “search order id” query is working and displaying the relevant detail
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
Then Verify that the relevant details are displayed
@TC_118
Scenario: Verify that all the details of newly generated order number in booked itinerary page are correct and match with data during booking.
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
Then Verify all the details of order number are correct as entered during saving order
@TC_119
Scenario: To verify that the order gets cancelled after click on Cancel order number link

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
Then Verify that order number is cancelled and now longer exists in Booked Itinerary page
@TC_120
Scenario: To verify that the order gets cancelled after click on Cancel order number link

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
Then Click on booked itinerary button and verify that application directs to booked itinerary form





