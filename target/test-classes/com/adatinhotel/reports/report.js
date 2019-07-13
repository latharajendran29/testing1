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
  "duration": 2356472300,
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
