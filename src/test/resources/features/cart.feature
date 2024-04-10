Feature: add to cart

  Background:
    Given user on the Register Page

@Cart
  Scenario Outline: user purchase a item
    Given user enters credential to login <strUsername> with <strPassword>
    When user add <strItem> to the cart
    Then user going to see <strAdded>
    Examples:
      | strUsername | strPassword | strItem     | strAdded       |
      | Danip123    | 123Dan      | Macbook Pro | Product added. |

  @Cart @Ignore
  Scenario Outline: user delete an item
    Given user enters credential to login <strUsername> with <strPassword>
    When user add <strItem> to the cart
    Then user going to see <strAdded>
    When user go to the Cart
    Then delete the item

    Examples:
      | strUsername | strPassword | strItem     | strAdded       |
      | Danip123    | 123Dan      | Macbook Pro | Product added. |