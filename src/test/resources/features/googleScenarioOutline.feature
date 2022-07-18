Feature: Data Driven testing using Scenario Outline

  @google_scenario_outline
  Scenario Outline: Google capital cities search
    Given User is on Google search page
    When User searches for "<country>" capital
    Then User should see "<capital>" in the result
    Examples:
      | country     | capital          |
      | Azerbaijan  | Baku             |
      | Tajikistan  | Dushanbe         |
      | Bulgaria    | Sofia            |
      | Ukraine     | Kyiv             |
      | Afghanistan | Kabul            |
      | USA         | Washington, D.C. |
      | Turkey      | Ankara           |
    #Scenario Outline and ApachePOI_ExcelRead testing both of them are Date Driven Testing
  #If company has 40-50 DATAs for testing we can use Scenario outline
  #But if company has to much DATAs like 1000 lines of excels we can't use scenario outline
  #In that case we use ApachePOI_ExcelRead
  #ApachePOI_ExcelRead can come in interview