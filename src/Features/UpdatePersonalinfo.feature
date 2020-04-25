@tag1
Feature: UpdatePersonalinfoFeature
  This feature deals with updating a signed in user's social title

  Background: User is on Personal Information page
    Given User navigate to the login page
    And User enter the username as "automationtestuser613@gmail.com" and password as "G3thyphy!?!"
    And User clicks login button
    And User clicks personal information icon
    Then User is on personal information page

  Scenario: User updates his/her social title
    Given Social title radio buttons are visible to user
    When User clicks on non-selected title
    And User enters current password
    And User clicks on Save
    Then User's personal information is updated

  Scenario: User updates his/her first name, last name, and email address
    Given: First name, last name, and email address input fields are visible to user
    When User enters the following for his/her updated first name, last name and email
      | First Name  | Last Name | Email Address                   |
      | AutomationX | UserX     | automationtestuser613@gmail.com |
    And User enters current password
    And User clicks on Save
    Then User's personal information is updated