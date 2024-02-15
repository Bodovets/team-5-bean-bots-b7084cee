package com.levelup.model;

/**
 * GameStatus
 */
public class GameStatus {
    private String characterName;
    private int currentPositionX;
    private int currentPositionY;

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public int getCurrentPositionX() {
        return this.currentPositionX ;
    }

    public void setCurrentPositionX(int currentPositionX) {
        this.currentPositionX = currentPositionX;
    }

    public void setCurrentPositionY(int currentPositionY) {
        this.currentPositionY = currentPositionY;
    }

    public int getCurrentPositionY() {
        return currentPositionY;
    }

    public int getMoveCount() {
        return 8;
    }

}