Feature: Automate Product Booking Website

  Scenario: Add a product into cart and Order it

    Given User is on HomePage
    When user selects a product and click on AddToCart
    Then Click on cart and check product is added
    And Click on Proceed To Checkout button
    Then Verify Product is added or not into Table
    And Click on Place Order
    Then Select a Country and Agree Terms
    And Click on Proceed Button
    Then Verify Success Message
    Then Verify user redirected to HomePage