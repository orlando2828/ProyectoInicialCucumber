Feature:Test Google search functinally

  Scenario: As a user I enter a search criteria in google
    Given I am on the google search page
    When I enter a search criteria
    And click on the search button
    Then the results match the criteria
