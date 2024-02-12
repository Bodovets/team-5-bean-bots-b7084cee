Feature: StartGame

I want to start playing the game
Using the default character, start the game and make sure the map is created and the character is placed on it. If my game has a random starting position, I'll need to have a GIVEN that allows me to use a FakeGame that lets me pass a stubbed starting position.

Scenario Outline:: Start the game

    When the game is started
    Then the Game has <numPositions> positions
    And the Game sets the character's X position to <startingPositionX>
    And the Game sets the character's Y position to <startingPositionY>
    And the move count is <startingMoveCount>

    Examples:

        | numPositions | startingPositionX | startingPositionY | startingMoveCount |
        | 100          | 0                 | 0                 | 0                 |

