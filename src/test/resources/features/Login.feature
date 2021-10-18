@wip
Feature: Users should be able to login
  Scenario: Login with valid credentials
    Given the user is on the home page
    When the user enters valid credentials
    Then the user is logged in

    Scenario: Purchasing shoes
      Given the user is logged in
      Then he should be able to make a purchase