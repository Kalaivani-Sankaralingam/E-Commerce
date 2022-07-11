Feature: validate login page

  Scenario: verify user can login
    Given user is in login page
    And user enters email address
    And user enters password
    When user clicks sign in button
    Then user can login to the home page
