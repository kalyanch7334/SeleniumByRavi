Feature: Login

  Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome Browser
    When User Opens URL "http://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on Log out link
    Then Page Title should be "nopCommerce demo store. Login"
    And close browser

    Scenario Outline: Login Data Driven
      Given User Launch Chrome Browser
      When User Opens URL "http://admin-demo.nopcommerce.com/login"
      And User enters Email as "<email>" and Password as "<password>"
      And Click on Login
      Then Page Title should be "Dashboard / nopCommerce administration"
      When User click on Log out link
      Then Page Title should be "nopCommerce demo store. Login"

      Examples:
        | email |password|
        |admin@yourstore.com|admin|
        |admin1@yourstore.com|admin123|



