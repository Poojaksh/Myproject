Feature: Orange HRM Functionality

  Background: 
    Given user on login page
    When user enter valid username and valid password

  @HomePage
  Scenario: Check HomePage Functionality
    When user is on homepage
    Then user validate logo of the application
    And user validate title of the applicagtion

  @AdminPage
  Scenario: Check Admin page Functionality
    When user click on AdminPage
    Then user click on Add button
    And user enter all add employee details
