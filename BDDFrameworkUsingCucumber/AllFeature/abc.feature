Feature: Test Login Functionality

  Scenario: check login functionality with valid password and username
    Given User is on Login page
    When Enter valid username and Password
    Then Login is Succesful and user is on login page
