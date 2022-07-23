$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E2E.feature");
formatter.feature({
  "line": 1,
  "name": "Automate Product Booking Website",
  "description": "",
  "id": "automate-product-booking-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add a product into cart and Order it",
  "description": "",
  "id": "automate-product-booking-website;add-a-product-into-cart-and-order-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user selects a product and click on AddToCart",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click on cart and check product is added",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Proceed To Checkout button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify Product is added or not into Table",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on Place Order",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Select a Country and Agree Terms",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Proceed Button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify Success Message",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Verify user redirected to HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.user_is_on_HomePage()"
});
formatter.result({
  "duration": 6313170600,
  "status": "passed"
});
formatter.match({
  "location": "steps.user_selects_a_product_and_click_on_AddToCart()"
});
formatter.result({
  "duration": 1386073000,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_cart_and_check_product_is_added()"
});
formatter.result({
  "duration": 174260500,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Proceed_To_Checkout_button()"
});
formatter.result({
  "duration": 102375900,
  "status": "passed"
});
formatter.match({
  "location": "steps.verify_Product_is_added_or_not_into_Table()"
});
formatter.result({
  "duration": 52426600,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Place_Order()"
});
formatter.result({
  "duration": 579728200,
  "status": "passed"
});
formatter.match({
  "location": "steps.select_a_Country_and_Agree_Terms()"
});
formatter.result({
  "duration": 2270027800,
  "status": "passed"
});
formatter.match({
  "location": "steps.click_on_Proceed_Button()"
});
formatter.result({
  "duration": 86217200,
  "status": "passed"
});
formatter.match({
  "location": "steps.verify_Success_Message()"
});
formatter.result({
  "duration": 5071280600,
  "status": "passed"
});
formatter.match({
  "location": "steps.verify_user_redirected_to_HomePage()"
});
formatter.result({
  "duration": 1297241300,
  "status": "passed"
});
});