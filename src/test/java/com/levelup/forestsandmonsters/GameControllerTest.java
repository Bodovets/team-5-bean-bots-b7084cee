package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class GameControllerTest {
    @Test
    public void initializationCreatesResults() {
        GameController testObj = new GameController();
        assertNotNull(testObj.status);
    }

    @Test
    public void moveCallsCharactersMove() {
        GameController testObj = new GameController();
        FakeCharacter mockCharacter = new FakeCharacter();
        testObj.character = mockCharacter;

        testObj.move(DIRECTION.EAST);

        assertEquals(DIRECTION.EAST, mockCharacter.directionProvided);
        assertEquals(mockCharacter.STUBBED_NEW_POSITION, testObj.character.currentPosition);
        assertEquals(mockCharacter.STUBBED_NEW_POSITION.coordinates, testObj.getStatus().currentPosition);
    }

    @Test
    public void startGameInitializesMapAndGivesToChracter() {
        GameController testObj = new GameController();
        FakeCharacter mockCharacter = new FakeCharacter();
        testObj.character = mockCharacter;

        testObj.startGame();

        assertNotNull(testObj.map);
        assertEquals(mockCharacter.STUBBED_NEW_POSITION, mockCharacter.currentPosition);

    }

}