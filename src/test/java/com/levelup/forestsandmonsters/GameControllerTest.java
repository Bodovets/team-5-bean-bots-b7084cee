package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GameControllerTest {
    private GameController testObj;

    @Before
    public void init() {
        testObj = new GameController();
    }

    @Test
    public void initializationCreatesResults() {
        assertNotNull(testObj.status);
    }

    @Test
    public void gameStatusToStringTest() {
        GameController.GameStatus gameStatus = testObj.getStatus();
        String name = "Joe";
        gameStatus.characterName = name;
        gameStatus.currentPosition.setLocation(5, 70);
        gameStatus.moveCount = 32;
        assertTrue(gameStatus.toString().contains(name));
        assertTrue(gameStatus.toString().contains("5"));
        assertTrue(gameStatus.toString().contains("70"));
        assertTrue(gameStatus.toString().contains("32"));
    }

    @Test
    public void initMoveCountTest() {
        GameController.GameStatus gameStatus = testObj.getStatus();
        assertEquals(0, gameStatus.moveCount);
    }

    @Test
    public void createCharacterTest() {
        String name = "Mike";
        testObj.createCharacter(name);
        assertEquals(name, testObj.getStatus().characterName);
        assertNotNull(testObj.character);
    }

    // @Test
    // public void startGameTest() {
    //     testObj.startGame();
    //     assertNotNull(testObj.getStatus());
    //     assertNotNull(testObj.character);
    // }

}
