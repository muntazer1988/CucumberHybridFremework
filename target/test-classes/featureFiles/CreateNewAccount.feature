
Feature: User creates new account

  Background: 
    Given User navigated to the sign up pape
   @test
  Scenario: Create account with valid information
    When User enter first name "Neno"
    And User enter last name "Jan"
    And User enter email "neno@gmail.com"
    And User enter password "neno2020"
    Then User clicks on sign up button

  Scenario: Create account with duplicate information
    When User enter first name "Neno"
    And User enter last name "Jan"
    And User enter email "neno@gmail.com"
    And User enter password "neno2020"
    Then User clicks on sign up button
    Then User shold get a proper message

  Scenario: Create account not providing information
    When User do not enter first name
    And User do not enter last name
    And User do not enter email
    And User do not enter password
    Then User clicks on sign up button
    Then User shold get a proper message
