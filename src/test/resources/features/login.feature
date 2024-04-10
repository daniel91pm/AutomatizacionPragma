Feature: Login

  Background:
    Given user on the Register Page

  @Login
  Scenario Outline:user Login succesfully
    When user enters credential to login <strUsername> with <strPassword>
    Then user see <strLogin> string
    Examples:
      | strUsername | strPassword | strLogin |
      | Danip123    | 123Dan      | Welcome  |
