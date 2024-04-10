Feature: Register

  Background:
    Given user on the Register Page


  @Register @Ignore
  Scenario Outline: user register successfully
    When user enters <strUsername> and <strPassword>
    Then user see <strLogin> message

    Examples:
      | strUsername | strPassword | strLogin            |
      | Daniww123    | 123Dan      | Sign up successful. |

  @Register
  Scenario Outline: user register unsuccessfully
    When user enters <strUsername> and <strPassword>
    Then user see <strLoginFailed> message

    Examples:
      | strUsername | strPassword | strLoginFailed           |
      | Danio123    | 123Dan      | This user already exist. |