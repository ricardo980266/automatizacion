@contact-us @regression
Feature: WebDriver University - Contact Us Page

  Background:
    Given  I access the webdriver university contact us page

  Scenario: Vallidate Successfull Submission - Unique Data
    When I enter a unique first name
    And I enter a unique last name
    And I enter a unique email address
    And I enter a unique comment
    And I click on the submit button
    Then I should be presented with a successful contact us submission message

  Scenario: Validate Succesful Submission - Specifict Data
    When I enter a specific first name Ricardo
    And  I enter a specific last name Caro
    And I enter a specific email address ricardo@gmail.com
    And I enter a specific comment "How are you"
    And I click on the submit button
    Then I should be presented with a successful contact us submission message


