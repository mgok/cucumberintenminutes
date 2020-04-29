Feature: User wants to add two positive integer numbers
  - The sum of the two positive numbers must again be a positive number.

Scenario: The sum of two positive numbers should give a positive result
  Given We have the positive integers 3 and 5
  When I want to sum up these numbers
  Then I should get the answer 8
