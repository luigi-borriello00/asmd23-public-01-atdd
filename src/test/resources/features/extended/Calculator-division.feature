Feature: Using the calculator to do divisions

  Background: I have a calculator
    Given I have a Calculator

  Scenario: Dividing two positive numbers greater than 0
    When I divide 6 by 2
    Then the result should be 3

  Scenario: Dividing two negative numbers
    When I divide -6 by -2
    Then the result should be 3

  Scenario: Dividing a positive number by a negative number
    When I divide 6 by -2
    Then the result should be -3

  Scenario: Dividing a negative number by a positive number
    When I divide -6 by 2
    Then the result should be -3

  Scenario Outline: Dividing a number by 0
    When I divide <number> by 0
    Then the operation should fail

    Examples:
      | number |
      | 6      |
      | -6     |
      | 0      |