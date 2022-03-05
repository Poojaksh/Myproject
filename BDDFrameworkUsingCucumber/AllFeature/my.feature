Feature: Orange HRM Functionality

  @HomePage
  Scenario: Given user on login page
    When user enter valid username and valid password
    Then Check HomePage Functionality
    When user is on homepage
    Then user validate logo of the application
    And user validate title of the applicagtion
