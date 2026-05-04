Feature: Search and Place order for product
  @OffersPage
  Scenario Outline: Search Experience for product search in both home and Offers page.
    Given User in on GreenCart Landing Page
    When User search with ShortName <Name> and extracted actual name of the product
    And Added "3" items of the  selected product to the cart
    Then user searched for <Name>  shortname in the offers page
    And validate product name in offers page matches with landing Page

    Examples:
    |Name |
    | Tom |
    | Beet |