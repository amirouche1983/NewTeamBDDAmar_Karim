Feature:AAA_homePageTest

#  Background:
#    Given

#  @SmokeTest
  Scenario: test user landing on AAA home page
    Given user enter url "https://northeast.aaa.com/"
    When  user land on AAAHomePage
    Then user should see "https://northeast.aaa.com/"
