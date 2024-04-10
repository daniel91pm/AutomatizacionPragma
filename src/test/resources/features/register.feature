Feature: Register

  Background:
    Given user on the Register Page


  @Register @Ignore
  Scenario Outline: user register successfully
    When user enters <strUsername> and <strPassword>
    Then user see <strMessage> message

    Examples:
      | strUsername | strPassword | strMessage            |
      | Daniww123   | 123Dan      | Sign up successful. |

  @Register
  Scenario Outline: user register already exist
    When user enters <strUsername> and <strPassword>
    Then user see <strMessage> message

    Examples:
      | strUsername | strPassword | strMessage          |
      | Danio123    | 123Dan      | This user already exist. |

  @Register
  Scenario Outline: user register fill the blanks
    When user enters <strUsername> and <strPassword>
    Then user see <strMessage> message

    Examples:
      | strUsername | strPassword | strMessage                           |
      |             | 123Dan      | Please fill out Username and Password. |