Feature: Login functionality
  I want to use this template for my feature file

  Background: 
    Given User navigates to login page

  @execute @example @all
  Scenario Outline: Login with valid credentials
    When User enter valid email address <email>
    And User enter valid password <password>
    And User clicks on login button
    Then User should get successfully login

    Examples: 
      | email                    | password   |
      | omid.muntazeer@gmail.com | Imran-2017 |
      | omid.muntatter@gmail.com | Imran-3017 |

  Scenario: Login with invalid credentials
    When User enter invalid email address "omid.munt545azeer@gmail.com"
    And User enter invalid password "Imran-2002017"
    And User clicks on login button
    Then User should get a proper message

  Scenario: Login with valid email address and invalid password
    When User enter valid email address "omid.muntazeer@gmail.com"
    And User enter invalid password "Imran-2002017"
    And User clicks on login button
    Then User should get a proper message

  Scenario: Login with invalid email address and valid password
    When User enter invalid email address "omid.munt545azeer@gmail.com"
    And User enter valid password "Imran-2017"
    And User clicks on login button
    Then User should get a proper message

  Scenario: Login without providing any credentials
    When User do not enter credentials
    And User clicks on login button
    Then User should get a proper message
