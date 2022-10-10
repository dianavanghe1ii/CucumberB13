@smartRegression
Feature: validation or Product
#  Scenario: Validation of New Product Creation
#    When User provides valid username and password
#    Then User validates the title 'Web Orders' and clicks Order Button
#    When User enters the product information 'MyMoney' and '4'
#    And User enters address information 'Diana', 'Midway Dr', 'Mount Prospect','IL', '60635'
#    And User enters payment information '123456789', '06/12','VISA'
#    Then User clicks Process button and validates the message 'New order has been successfully added.'

#  Scenario Outline: Validation of New Product Creation
#    When User provides valid username and password
#    Then User validates the title 'Web Orders' and clicks Order Button
#    When User enters the product information '<productName>' and '<quantity>'
#    And User enters address information '<customerName>', '<street>', '<city>','<state>', '<zipcode>'
#    And User enters payment information '<cardNumber>', '<expirationDate>','<cardType>'
#    Then User clicks Process button and validates the message '<message>'
#    Examples:
#      | productName | quantity | customerName | street    | city           | state | zipcode | cardNumber | expirationDate | cardType         | message                                |
#      | MyMoney     | 4        | Diana        | Midway Dr | Mount Prospect | IL    | 60635   | 123456789  | 06/12          | VISA             | New order has been successfully added. |
#      | FamilyAlbum | 7        | Diana        | Midway Dr | Mount Prospect | IL    | 60635   | 123456789  | 06/12          | MASTERCARD       | New order has been successfully added. |
#      | ScreenSaver | 8        | Diana        | Midway Dr | Mount Prospect | IL    | 60635   | 123456789  | 06/12          | AMERICAN EXPRESS | New order has been successfully added. |

  Scenario: Validation of New Product Creation
    When User provides valid username and password
    Then User validates the title and clicks Order Button
      | title | Web Orders |
    When User enters the product information
      | productName | MyMoney |
      | quantity    | 4       |
    And User enters address information
      | customerName | Diana          |
      | street       | Midway Dr      |
      | city         | Mount Prospect |
      | state        | IL             |
      | zipcode      | 60635          |
    And User enters payment information
      | cardNumber     | 123456789 |
      | expirationDate | 06/12     |
      | cardType       | VISA      |
    Then User clicks Process button and validates the message
      | New order has been successfully added. |
