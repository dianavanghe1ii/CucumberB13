@regression1
Feature: Etsy Search Functionality with Scenario Outline

  Scenario Outline: Validation title of Etsy Search Search
    When  User searches for '<searchItem>'
    Then User validates the title is '<title>'
    Examples:
      | searchItem | title      |
      | Hat        | Hat - Etsy |
      | Key        | Key - Etsy |
      | Pin        | Pin - Etsy |
