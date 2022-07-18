Feature: git practice

  @git
  Scenario: Login as librarian
    #Given user is on library login page
    When user enter librarian username
    And user enter librarian password
    Then user should see dashboard