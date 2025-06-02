Feature: Login

  Scenario Outline: As a user, I want to login and verify that I've logged in
    Given I am in the login page
    And I enter the MSISDN <MSISDN>
    And I enter the password <password>
    When I click on the login button
    Then I should see the home page
    Examples:
      | MSISDN    | password |
      | 810708491 | betw@y1@ |

