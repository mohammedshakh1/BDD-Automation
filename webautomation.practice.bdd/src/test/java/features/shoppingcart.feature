@shoppingCart

Feature: Shopping Cart
  Scenario: Search for macbook and Add in Cart
    Given Searh for MacBook
    When Macbook options displayed in Next page
    And Add amazon Choice to Cart
    Then Confirm it is added in Cart