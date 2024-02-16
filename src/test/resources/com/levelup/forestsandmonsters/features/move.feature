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
| 0 | 0 | 1 | EAST | 1 | 0 | 2 |
# | 9 | 9 | EAST | 32 | 9 | 9 | 33 |
# | 5 | 9 | NORTH | 5 | 9 | 1 | 6 |
# | 7 | 0 | SOUTH | 32 | 7 | 0 | 33 |
# | 0 | 0 | WEST | 5 | 0 | 0 | 6 |
# | 0 | 1 | EAST | 6 | 0 | 2 | 7 |
# | 0 | 9 | NORTH | 104 | 0 | 9 | 105 |
# | 9 | 0 | EAST | 23 | 9 | 0 | 24 |
# | 2 | 3 | WEST | 10 | 0 | 1 | 11 |
