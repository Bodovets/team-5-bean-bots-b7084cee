Feature: ForestsAndMonsters
![Gamer](images/gamerErin.png)

I want to create a new custom character, setting only their name.
This split is VERY simple, to get us started. Just barebones game functionality.

    Scenario Outline: Set character name
    Given the character's name is <characterNameInput>
    When the character sets their name
    Then the Game sets the character's name to <characterNameOutput>
    Examples:
        | characterNameInput | characterNameOutput |
        | "Michelle"          | "Michelle"           |
        | ""              | "Erin"         |
        | "Complicated name that is very long and strange" | "Complicated name that is very long and strange" |
        | "Name_$#*(" | "Name_$#*(" |

