@Login @regression
Feature: WebDriver university - Login Page

  Background:
    Given I access the webdriver university login page

  Scenario: Validate Sucecessful Login
    When I enter a username webdriver
    And I enter a password webdriver123
    And I clic on thhe login button
    Then I should be present with the successful login message


  Scenario: Validate Unsucecessful Login
    When I enter a username webdriver
    And I enter a password web
    And I clic on thhe login button
    Then I should be present with the unsuccessful login message
  @Login1
  Scenario Outline: Vlidate - Successful and Unsuccesful login
    When I enter a username <username>
    And I enter a password <password>
    And I clic on thhe login button
    Then i should be presented with the following login validation message <loginValidationMessage>

    Examples:
      | username  | password     | loginValidationMessage |
      | webdriver | webdriver123 | validation succeeded   |
      | webdriver | webdriver    | validation failed      |