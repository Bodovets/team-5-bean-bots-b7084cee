Feature: Move in a direction 
    
I want to move my character. If they attempt to 
move past a boundary, the move results in no change in position.
    
<img src="images/sbe.png" width="300">

Scenario Outline: Move in a direction
    Given the character starts at position with XCoordinates <startingPositionX> 
    And starts at YCoordinates <startingPositionY>
    And the current move count is <staringMoveCount>
    And the player choses to move in <direction>
    When the character moves
    Then the character is now at position with XCoordinates <endingPositionX>
    And YCoordinates <endingPositionY>
    And the ending move count is <endingMoveCount>
    Examples:
        | startingPositionX | startingPositionY | staringMoveCount | direction | endingPositionX | endingPositionY | endingMoveCount |
        | 0 | 0 | 5   | NORTH | 0 | 1 | 6 |
        | 0 | 0 |  2  | SOUTH | 0 | 0 | 3 |
        | 0 | 0 | 55  |  WEST  | 0 | 0 | 56 | 
        | 5 | 7 | 7   | EAST  | 6 | 7 | 8 |
        | 5 | 3 | 38  | WEST  | 4 | 3 |  39 |
        | 9 | 3 | 103 | WEST  | 8 | 3 | 104 |
        | 9 | 3 | 1   | EAST  | 9 | 3 | 2 |
        | 3 | 9 | 93  | NORTH | 3 | 9 | 94 |
        | 3 | 9 | 12  | SOUTH | 3 | 8 | 13 |