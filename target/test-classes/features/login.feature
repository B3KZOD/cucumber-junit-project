@Regression
Feature: Library app login feature
  User Story: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  #Similar to TestNG @BeforeMethod. Background is running before each scenario
  Background:
    Given user is on library login page

  @librarian @employee
  Scenario: Login as librarian
    #Given user is on library login page
    When user enter librarian username
    And user enter librarian password
    Then user should see dashboard

  @student
  Scenario: Login as student
    #Given user is on library login page
    When user enter student username
    And user enter student password
    Then user should see dashboard

  @admin
  Scenario: Login as admin
    #Given user is on library login page
    When user enter admin username
    And user enter admin password
    Then user should see dashboard