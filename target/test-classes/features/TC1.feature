@wip
Feature: User should be able to add mentions about only department employees.
  User Story:As a user, I should be able to add link, insert video, mention, quote, add tag in Appreciation

 Scenario:
    Given user is on the homepage
    When user clicks the "More" drop down
    When user click the "Appreciation"
    When user clicks the mention sign button
    When user writes mention on blockquote  page
    When user adds mention to Sales Department Employees
    Then user click save button

   Scenario:
     Given user is on the homepage
     When user clicks the "More" drop down
     When user click the "Appreciation"
     When user clicks the mention sign button
     When user writes mention on blockquote  page
     When user adds mention to All Employees
     Then user click save button
