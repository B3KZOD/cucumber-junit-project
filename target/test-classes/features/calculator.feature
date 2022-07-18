Feature: Calculator should work for simple mathq

  As a user i should be able to do simple math

  Background:
    Given Calculator is open

  Scenario: Should be able to add two numbers
    When I add 2 with 3
    Then I should get 5

  Scenario: Should be able to add two numbers
    When I add 10 with 5
    Then I should get 15

  Scenario: Should be able to add two numbers
    When I add 20 with 25
    Then I should get 45

