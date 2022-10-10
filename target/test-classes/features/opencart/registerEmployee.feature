Feature: Creating and Validating Employee Address

  Scenario Outline: Register Employee and Validate the message
    Given User provides valid username and password for openChart website
    And User clicks the close button from alert pop-up
    When User clicks the Customer button and validates the 'Customers'
    And User clicks the Add button and validates the 'Add Customer'
    And User click the Address button and provides '<fistName>', '<lastName>', '<address>', '<city>', '<country>', '<region>'
    Then  user clicks the Save button and validates the message 'Warning: You do not have permission to modify customers! '
    Examples:
      | fistName | lastName  | address        | city     | country | region  |
      | Diana    | Vanghelii | 250 W Broad St | Richmond | USA     | Henrico |
      | Dan    | Smith | 250 W Broad St | Richmond | USA     | Henrico |
      | David    | Brown | 250 W Broad St | Richmond | USA     | Henrico |