Feature: Eating too many cucumbers may not be good for you
  user story: Eating too much of any thing may not be good for you

  @eating
  Scenario: Eating a few is no problem
    Given John is hungry
    When he easts some cucumbers
    Then he will be full

  @eating
  Scenario: Eating a few is no problem
    Given "John" is hungry
    When he easts 3 cucumbers
    Then he will be full