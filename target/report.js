$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/eclipse-workspace/CucumberAdactin/src/test/resources/Login.feature");
formatter.feature({
  "name": "Login into Adactin Hotel Application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login using username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launches the adactin url",
  "keyword": "Given "
});
formatter.match({
  "location": "Login_StepDefinition.user_launches_the_adactin_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "Login_StepDefinition.user_enters_the_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login_StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Search Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login_StepDefinition.user_navigates_to_Search_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/HP/eclipse-workspace/CucumberAdactin/src/test/resources/SearchHotel.feature");
formatter.feature({
  "name": "Search Hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search Hotel based on user needs",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters all the mandatory fields",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchHotel_StepDefinition.user_enters_all_the_mandatory_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters other fields if required",
  "keyword": "When "
});
formatter.match({
  "location": "SearchHotel_StepDefinition.user_enters_other_fields_if_required()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the search button",
  "keyword": "And "
});
formatter.match({
  "location": "SearchHotel_StepDefinition.user_clicks_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Select Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchHotel_StepDefinition.user_navigates_to_Select_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/HP/eclipse-workspace/CucumberAdactin/src/test/resources/SelectHotel.feature");
formatter.feature({
  "name": "Select Hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User visibly verifies and selects a hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks select button",
  "keyword": "Given "
});
formatter.match({
  "location": "SelectHotel_StepDefinition.user_clicks_select_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks continue button",
  "keyword": "And "
});
formatter.match({
  "location": "SelectHotel_StepDefinition.user_clicks_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Book A Hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "SelectHotel_StepDefinition.user_navigates_to_Book_A_Hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/HP/eclipse-workspace/CucumberAdactin/src/test/resources/TBookHotel.feature");
formatter.feature({
  "name": "Book Hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Book Hotel using users personal details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User enters all the fields marked with asterix",
  "keyword": "Given "
});
formatter.match({
  "location": "BookHotel_StepDefinition.user_enters_all_the_fields_marked_with_asterix()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks book now button",
  "keyword": "And "
});
formatter.match({
  "location": "BookHotel_StepDefinition.user_clicks_book_now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Booking Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "BookHotel_StepDefinition.user_navigates_to_Booking_Confirmation_page()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("C:/Users/HP/eclipse-workspace/CucumberAdactin/src/test/resources/TBookingConfirmation.feature");
formatter.feature({
  "name": "Booking Confirmation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User visibly verifies if all the details are correct",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User clicks logout button",
  "keyword": "Given "
});
formatter.match({
  "location": "BookingConfirmation_StepDefinition.user_clicks_logout_button()"
});
formatter.result({
  "status": "passed"
});
});