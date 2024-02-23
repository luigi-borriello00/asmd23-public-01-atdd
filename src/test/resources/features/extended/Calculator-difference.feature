Feature:  Finding the Difference with a Calculator
  In order to not learn math
  As someone who is bad at math
  I want to be able to find the difference between numbers using a Calculator

  Scenario Outline: Subtract two numbers
    Given I have a Calculator
    When I subtract <number1> from <number2>
    Then the difference should be <difference>

    Examples:
      | number1 | number2 | difference |
      | 5       | 3       | 2          |
      | 3       | 5       | -2         |
      | 0       | 0       | 0          |
      | 0       | 1       | -1         |
      | 1       | 0       | 1          |
      | 0       | -1      | 1          |
      | -1      | 0       | -1         |
      | -1      | -1      | 0          |
      | -1      | 1       | -2         |
      | 1       | -1      | 2          |
