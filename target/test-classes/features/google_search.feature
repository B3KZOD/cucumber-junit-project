@smoke
Feature: Google Search Functionality  Title Verification
  User story: As a user, when I am on the Google search page
  I should be able to search whatever i want and see relevant information
  #(Agile story)

  Background:
    Given User is on Google search page


  Scenario: Google Search Functionality Title Verification
    When User types apple in the google search box and clicks enter
    Then  User sees apple – Google Search is in the google title

  @googleSearch
  Scenario: Google Search Functionality Title Verification
    When User types "orange" in the google search box and clicks enter
    Then  User sees "orange - Google Search" is in the google title

