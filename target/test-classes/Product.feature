Feature: To Validate Add To Cart Feature

  Scenario: To validate adding and removing products in add to cart
    Given User has to launch the browser and flipkart application
    When User has to search the product through search box
    And User has to select and adding product into cart
    And User has to place order and login to the application
    And User has to selecting address and payment option
    And User has to remove the product from the cart
    Then User has to close the browser
