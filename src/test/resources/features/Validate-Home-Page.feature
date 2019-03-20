@debug
Feature: Validate Home Page
  I want to validate the home page

  @debug
  Scenario: Validate home page
    Given I navigate to "http://www.namaonline.org"
    When I click on the home page
    Then I validate that the page title is "Welcome to North American Manipur Association!"
