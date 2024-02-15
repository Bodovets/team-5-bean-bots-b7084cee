Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 5 | 5 | NORTH | 0 | 5 | 6 | 1 |
            | 9 | 9 | EAST | 5 | 9 | 9 | 6 |
            | 5 | 9 | SOUTH | 7 | 5 | 8 | 8 |
            | 7 | 0 | SOUTH | 2 | 7 | 0 | 3 |
            | 0 | 0 | WEST | 5 | 0 | 0 | 6 |
            | 0 | 1 | EAST | 6 | 0 | 2 | 7 |
            | 0 | 9 | NORTH | 114 | 0 | 9 | 115 |
            | 9 | 0 | EAST | 23 | 9 | 0 | 24 |
            | 2 | 3 | WEST | 0 | 1 | 3 | 1 |
            | 4 | 5 | SOUTH | 5 | 4 | 4 | 6 |
            | 5 | 6 | SOUTH | 7 | 5 | 5 | 8 |
            | 1 | 2 | EAST | 11 | 2 | 2 | 12 |
            | 7 | 8 | NORTH | 33 | 7 | 9 | 34 |


