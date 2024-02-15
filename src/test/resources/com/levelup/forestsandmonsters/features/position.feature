Feature: Position

I want to create a position class to place the character.
This split is VERY simple: the only customization is setting the x and y.

Scenario Outline:: Create Position

    Given User supplies values <x> and <y>
    When the position is created
    Then the created position is <xOutput>,<yOutput>
    Examples:
        | x | y |xOutput|yOutput
        | 5 | 6 | 5| 6
        

