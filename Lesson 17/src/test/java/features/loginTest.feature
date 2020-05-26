Feature: Test Login
  Scenario: Valid login test
    Given User is in login page
    When User enters valid login
    And User enters valid password and click Enter button
    Then Verify that user is logged in

  Scenario: Invalid login test
    Given User is in login page
    When User enters invalid login
    And User enters invalid password and click Enter button
    Then Verify that user is not logged in