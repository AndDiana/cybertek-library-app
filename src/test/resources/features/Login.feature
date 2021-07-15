@wip
Feature: Library login feature
  User Story :
  As a user, I should be able to login with correct credentials to different accounts
  and see dashboard or books displayed
  Accounts are: librarian, student

  Background: Assuming user is on the login page
    Given user is on the login page

  @librarian
  Scenario: Login as librarian
    Given user is on the login page
    When user enters valid librarian username and password
    Then user should see the dashboard tab

  @student
  Scenario: Login as student
    Given user is on the login page
    When user enters valid student username and password
    Then user should see the books tab

