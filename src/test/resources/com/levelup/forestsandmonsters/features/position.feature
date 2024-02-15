Feature: Position

I want to create a position class to place the character.
This split is VERY simple: the only customization is setting the x and y.

Scenario Outline:: Create Position

    Given User supplies the x and y
    When the position is created
    Then the Game sets the position to x,y
    Examples:
        | x | y |
        | 5 | 6 |
        

