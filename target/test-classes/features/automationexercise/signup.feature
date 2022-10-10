#it is user story
Feature: Sign up Functionality
  #test description, meaning what you are going to test here
  Scenario: Creating and deleting user
    Given User navigates to automationExercise webpage
    And User validates the url of the page
    When User click signupLogin button
    Then User verifies New User Signup is visible
    And User enters name, email address and signup button