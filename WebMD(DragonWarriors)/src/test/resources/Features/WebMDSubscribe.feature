
@tag
Feature: I can subscribe webmd newsletter

  @tag1
  Scenario: I can subscribe webmd newsletter successfully
    Given I land on the WebMD homepage
    When I click on subscribe button
    And I enter my email to webmd newsletter box
    And click on subscribe button
    Then I can succesfully subscribe webmd newsletter


