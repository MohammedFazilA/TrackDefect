$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Product.feature");
formatter.feature({
  "name": "To Validate Add To Cart Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate adding and removing products in add to cart",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User has to launch the browser and flipkart application",
  "keyword": "Given "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_launch_the_browser_and_flipkart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to search the product through search box",
  "keyword": "When "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_search_the_product_through_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to select and adding product into cart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_select_and_adding_product_into_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to place order and login to the application",
  "keyword": "And "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_place_order_and_login_to_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to selecting address and payment option",
  "keyword": "And "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_selecting_address_and_payment_option()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to remove the product from the cart",
  "keyword": "And "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_remove_the_product_from_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ProductAddAndRemove.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});