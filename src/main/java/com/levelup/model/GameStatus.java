package com.levelup.model;

/**
 * GameStatus
 */
public class GameStatus {
    private String characterName;
    private int currentPositionX;

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


}