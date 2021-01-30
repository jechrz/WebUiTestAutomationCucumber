@tag1
Feature: LoginFeature
  This feature deals with the login functionality of the web application

  Scenario: Login with correct username and password
    Given User navigate to the login page
    And User enter the username as "automationtestuser613@gmail.com" and password as "G3thyphy!?!"
    And User clicks login button
    Then User is on my account page