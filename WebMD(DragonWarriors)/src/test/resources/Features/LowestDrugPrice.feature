@Sprint1
Feature: User can find lowest drug price

  @tag1
  Scenario: To find lowest drug price
    Given I land on the WebMD homepage
    When I click on find lowest drug prices
    And I view all drugs
    And I click on "<Liptor>"
    Then I can successfully find lowest price drugs
