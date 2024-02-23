Feature: Using a calculator to make multiplication easier

  Scenario Outline: Multiplying two numbers
    Given I have a Calculator
    When I press the number <number1>
    And I press the number <number2>
    And I press the multiply button
    Then the result should be <result> on the screen

    Examples:
      | number1 | number2 | result |
      | 2       | 2       | 4      |
      | 3       | 3       | 9      |
      | 4       | 4       | 16     |
      | 5       | 5       | 25     |
      | 6       | 6       | 36     |
      | 7       | 7       | 49     |
      | 8       | 8       | 64     |
      | 9       | 9       | 81     |
      | -1      | -1      | 1      |
      | -2      | -2      | 4      |
      | -3      | -3      | 9      |
      | -4      | -4      | 16     |