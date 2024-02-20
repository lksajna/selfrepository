Feature: Login with Valid Credentials

@sanity @regression
  Scenario: Successful Login with Valid Credentials
    Given User Launch browser
    And open URL "https://tutorialsninja.com/demo/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "a1234@a1234.com" and Password as "1234"
    And Click on Login button
    Then User navigates to MyAccount Page