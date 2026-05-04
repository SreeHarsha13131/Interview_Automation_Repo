Feature: Place order for product
  @PlaceOrder
  Scenario Outline: Search Experience for product search in both home and Offers page.
    Given User in on GreenCart Landing Page
    When User search with ShortName <Name> and extracted actual name of the product
    And Added "3" items of the  selected product to the cart
    Then user proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has ability to enter promo code and place the order

    Examples:
      |Name |
      | Tom |