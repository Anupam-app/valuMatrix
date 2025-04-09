Feature: XI candidate

  Scenario: Create Jobs
    Given I am on the Login page URL "https://beta.valuematrix.ai/login"
    Then I should see Sign In Page
    When I enter Candidate username as "raghavendra.shekaraiah@valuematrix.ai"
    And click on login button
    Then I am logged in
    And I click on Interview tab
    And select the slots menu
    And I click on create slots
    And I verify the month "April 2025"
    And I select the date "28" of month "April 2025"
    And I book the slot time "10:00 AM"