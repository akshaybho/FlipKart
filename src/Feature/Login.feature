Feature: User able to find the page is login page

  Background:
    Given user enters url
    Then user is landes on home page

  Scenario: User find the login page using its title
    Then user clicks on login button
    Then user validate the pageTitle