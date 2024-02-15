package com.levelup.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GameStatusTest {

    @Test
    void getCharacterNameTest () {
        GameStatus gameStatus = new GameStatus();
        gameStatus.setCharacterName("Vlad");
        assertNotNull(gameStatus.getCharacterName());
    }

    @Test
    void setAndGetCharacterNameTest () {
        GameStatus gameStatus = new GameStatus();
        String name = "Joe";
        gameStatus.setCharacterName(name);
        assertEquals(name, gameStatus.getCharacterName());
    }
    
    @Test
    void getCurrentPositionXTest () {
        GameStatus gameStatus = new GameStatus();
        assertNotNull(gameStatus.getCurrentPositionX());
    }

    @Test
    void setCurrentPositionXTest () {
        GameStatus gameStatus = new GameStatus();
        int currentPositionX = 3;
        gameStatus.setCurrentPositionX(currentPositionX);
        assertNotNull(gameStatus.getCurrentPositionX());
    }

    @Test
    void setAndGetCurrentPositionXTest () {
        GameStatus gameStatus = new GameStatus();
        int currentPositionX = 3;
        gameStatus.setCurrentPositionX(currentPositionX);
        assertEquals(currentPositionX, gameStatus.getCurrentPositionX());
    }

    @Test
    void getCurrentPositionYTest () {
        GameStatus gameStatus = new GameStatus();
        assertNotNull(gameStatus.getCurrentPositionY());
    }

    @Test
    void setCurrentPositionYTest () {
        GameStatus gameStatus = new GameStatus();
        int currentPositionY = 3;
        gameStatus.setCurrentPositionY(currentPositionY);
        assertNotNull(gameStatus.getCurrentPositionY());
    }

    @Test
    void setAndGetCurrentPositionYTest () {
        GameStatus gameStatus = new GameStatus();
        int currentPositionY = 3;
        gameStatus.setCurrentPositionY(currentPositionY);
        assertEquals(currentPositionY, gameStatus.getCurrentPositionY());
    }
}
