package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.model.Character;

public class GameController {

    static final String DEFAULT_CHARACTER_NAME = "Character";
    Character character;
    

    public class GameStatus {
        public String characterName = DEFAULT_CHARACTER_NAME;
        public Point currentPosition = null;
        public int moveCount = 0;

        @Override
        public String toString() {
        return "GameStatus [characterName=" + characterName + ", currentPosition" + currentPosition
                + ", moveCount=" + moveCount + "]";
        }
        public GameStatus() {
            this.currentPosition = new Point();
        }
    }

    GameStatus status;

    public GameController() {
        this.status = new GameStatus();
        this.status.moveCount = 0;

    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }

    // Pre-implemented to demonstrate ATDD
    // TODO: Update this if it does not match your design
    public void createCharacter(String name) {
        if (name != null && !name.equals("")) {
            status.characterName = name;
            this.character = new Character(name);
        } else {
            status.characterName = DEFAULT_CHARACTER_NAME;
            this.character = new Character(DEFAULT_CHARACTER_NAME);
        }
    }

    public void startGame() {
        // TODO: Implement startGame - Should probably create tiles and put the character
        // on them?
        // TODO: Should also update the game results?
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public void move(DIRECTION directionToMove) {
        // TODO: Implement move - should call something on another class
        // TODO: Should probably also update the game results
    }

    public void setCharacterPosition(Point coordinates) {
        // TODO: IMPLEMENT THIS TO SET CHARACTERS CURRENT POSITION -- exists to be testable
    }

    public void setCurrentMoveCount(int moveCount) {
        // TODO: IMPLEMENT THIS TO SET CURRENT MOVE COUNT -- exists to be testable
    }

    public int getTotalPositions() {
        // TODO: IMPLEMENT THIS TO GET THE TOTAL POSITIONS FROM THE MAP -- exists to be
        // testable
        return -10;
    }

}
