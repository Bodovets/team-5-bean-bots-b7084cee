package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void gameStatusToStringTest() {
        GameController testObj = new GameController();
        GameController.GameStatus gameStatus = testObj.getStatus();
        String name = "Joe";
        gameStatus.characterName = name;
        gameStatus.currentPositionX = 5;
        gameStatus.currentPositionY = 70;
        gameStatus.moveCount = 32;
        assertTrue(gameStatus.toString().contains(name));
        assertTrue(gameStatus.toString().contains("5"));
        assertTrue(gameStatus.toString().contains("70"));
        assertTrue(gameStatus.toString().contains("32"));
    }

}
