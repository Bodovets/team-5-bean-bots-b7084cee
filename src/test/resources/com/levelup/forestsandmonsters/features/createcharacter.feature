Feature: CreateCharacter
![Gamer](images/gamerErin.png)

I want to create a new custom character, setting only their name.
This split is VERY simple: the only customization is setting the name.

Scenario Outline:: Set character name

    Given player supplies the name <characterNameInput>
    When the character is created
    Then the Game sets the character name to <characterNameOutput>
    Examples:
        | characterNameInput | characterNameOutput |
        | "Erin"          | "Erin"           |
        | ""              | "Character"         |

