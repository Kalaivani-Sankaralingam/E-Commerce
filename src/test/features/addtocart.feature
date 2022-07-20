Feature: verify add to cart product
@addtocart
  Scenario: verify product added to cart successfully
    Given user in the home page
    And user can select the product
    When user clicks add to cart
    Then user can see the product in cart