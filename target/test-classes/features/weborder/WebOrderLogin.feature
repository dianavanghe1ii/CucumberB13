@smoke @regression
Feature: Login Functionality of WebOrder Page

#  Background: Navigation to the website
##    Given User navigates to the 'https://demo.weborder.net/'
#@smoke
#  Scenario: Validation of WebOrder Login page(Happy Path)
#    #Given User navigates to the 'https://demo.weborder.net/'
#    When User provides username 'guest1@microworks.com' and password 'Guest1!'
#    Then User validates the title 'ORDER DETAILS - Weborder' from homepage
#
#  Scenario: Validation of WebOrder Login page(Correct username Wrong password)
#    #Given User navigates to the 'https://demo.weborder.net/'
#    When User provides username 'guest1@microworks.com' and password 'ddddd'
#    Then User validates the message 'Sign in Failed' from login page
#
#  Scenario: Validation of WebOrder Login page(Wrong username Correct password)
#    #Given User navigates to the 'https://demo.weborder.net/'
#    When User provides username 'ccccc@gmail.com' and password 'Guest1!'
#    Then User validates the message 'Sign in Failed' from login page
#
#  Scenario: Validation of WebOrder Login page(Empty username Empty password)
#    #Given User navigates to the 'https://demo.weborder.net/'
#    When User provides username '' and password ""
#    Then User validates the message 'Sign in Failed' from login page

  Scenario Outline: Validation of WebOrder Login page(Empty username Empty password)
    When User provides username '<username>' and password "<password>"
    Then User validates the message '<message>' from login page
    Examples:
      | username                | password  | message        |
      | guest1@microworks.com   | dddddhdjh | Sign in Failed |
      | fgfdgds@gmailcom        | Guest1!   | Sign in Failed |
      |                         |           | Sign in Failed |
      | ^%^^*&*(*&)(*@yahoo.com | %@^$&#^%% | Sign in Failed |
      | afsdfsaf@gmail.com      | gdfthfh!  | Sign in Failed |
      | dfsfdgdf@gmailcom       | fsfsa     | Sign in Failed |
      | 132434534@gmail.com     | 23141345! | Sign in Failed |
      | GUEST1@MICROWORKS.COM   | guest1!   | Sign in Failed |

