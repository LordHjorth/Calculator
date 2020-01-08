Feature: Simple Calculator Test

  Scenario: Adding with multiple numbers
    Given that a is 2, b is 4, c is 6, d is 9 and e is 10
    Then the result should be 31

  Scenario: Adding with empty string
    Given that a is empty
    Then the result should be 0


  Scenario: Adding with single number
    Given that a is 1790
    Then the result should be 1790

  Scenario: Adding with new line character
    Given that a is 1790, b is 6553, c is "\n", d is 9088
    Then the result should be 17431
