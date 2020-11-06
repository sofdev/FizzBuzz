Feature: Jeux FizzBuzz 

 Scenario: scenario Fizz
    Given Jouer FizzBuzz
    When Quand je joue avec le numero 3
    Then le resultat est "... Fizz ..."
    
 Scenario: scenario Buzz
    Given Jouer FizzBuzz
    When Quand je joue avec le numero 5
    Then le resultat est "... Buzz ..."
    
 Scenario: scenario FizzBuzz
    Given Jouer FizzBuzz
    When Quand je joue avec le numero 54
    Then le resultat est "... Fizz ...... Buzz ..."
