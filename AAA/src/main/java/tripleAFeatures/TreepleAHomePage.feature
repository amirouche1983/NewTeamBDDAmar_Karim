Feature: TreepleAHomePage


  Scenario: test user landing on AAA home page
    Given user enter url
    When  user land on AAAHomePage
    Then user should see home page
