Feature:Contact form

  Background:
    Given user on the Register Page

  @Contact
  Scenario Outline: user fill contact form

    Given user enters credential to login <strUsername> with <strPassword>
    When user enter <strEmail> with <strName> and <strMessage> for fill contact form
    Then user see <strLogin> string
    Examples:
      | strUsername | strPassword | strEmail                   | strName | strMessage  | strLogin |
      | Danip123    | 123Dan      | danieljapones1@hotmail.com | Daniel  | Hello world | Welcome  |