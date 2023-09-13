
Feature: To Test Login functionality

  Scenario: Check Login functionality
    Given User navigate to shop page
    When User Clicked the signin button
    And User provided username and password 
    And User clicked the Login button
    Then user able to see Sign out button