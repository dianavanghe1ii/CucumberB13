@product
Feature: Testing Google Functionality
  Scenario: Happy path Google Search Functionality
    Given User navigates to the Google page
    When User searches for Techtorial
    Then User validates less than ten links on the Google Page