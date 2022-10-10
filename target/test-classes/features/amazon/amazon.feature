@product
Feature: Amazon Search Functionality
  Scenario: Positive scenario for amazon search
    Given User navigates to the Amazon page
    When User searches for iphone thirteen case
    Then User validates the number is fifty thousands results
    And User validates all headers containing iPhone