Feature: Passing multiple parameters to the steps


  @dataTable
  Scenario: User searches for multiple items
    Given User is on Google search page
    Then User should be able to search following:
      | java          |
      | selenium      |
      | cucumber bdd  |
      | QA automation |
      | wooden spoon  |