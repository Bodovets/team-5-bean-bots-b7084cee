Feature: Start the game
    
After a player starts the game (after character creation), I want to make sure the map is created and the character is placed in it

<img src="images/mapLayout.png" width="200">

Scenario Outline: Start the game
    When the game is started
    Then the map is initialized with number of positions <numPositions>
    And the character is at the starting position <characterStartingPosition>
    Examples:
        | numPositions | characterStartingPosition |
        | 100          | 0,0                       | 