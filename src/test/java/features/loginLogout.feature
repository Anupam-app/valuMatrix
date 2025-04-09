Feature: As user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "https://beta.valuematrix.ai/login"
    Then I should see Sign In Page
    When I enter Candidate username as "raghavendra.shekaraiah@valuematrix.ai"
    And click on login button
    Then I am logged in