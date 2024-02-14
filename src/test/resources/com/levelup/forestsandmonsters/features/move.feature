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
            |5|5|NORTH|5|6|
            |9|9|EAST|9|9|
            |5|9|SOUTH|5|8|
            |7|0|SOUTH|7|0|
            |0|0|WEASTSOUTHT|0|0|
            |0|1|EAST|0|2|
            |0|9|NORTH|0|9|
            |9|0|EAST|9|0|
            |2|3|WEASTST|1|3|
            |4|5|SOUTH|4|4|
            |5|6|SOUTH|5|5|
            |1|2|EAST|2|2|
            |7|8|NORTH|7|9|
