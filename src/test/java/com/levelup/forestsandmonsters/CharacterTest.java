package com.levelup.forestsandmonsters;

import org.junit.Test;
import com.levelup.model.Character;
import com.levelup.model.Position;
import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class CharacterTest {
    @Test
    public void initializationSetsNameToDefaultWhenEmpty() {
        Character testObj = new Character();
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("    ");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
    }

    @Test
    public void initializationSetsNameWhenNotEmpty() {
        Character testObj = new Character("Test Name");
        assertEquals("Test Name", testObj.getName());
    }

    @Test
    public void enterMapSetsMapAndStartingPosition() {
        Character testObj = new Character();
        GameMap m = new GameMap();
        testObj.enterMap(m);

        assertEquals(m, testObj.map);
        assertEquals(m.startingPosition, testObj.getPosition());
    }

    @Test
    public void moveCallsMapWithCorrectParams() {
        //Inject GameMap test double to allow us to test this
        Character testObj = new Character();
        FakeGameMap mockMap = new FakeGameMap();
        Position startingPosition = new Position(5,0);
        
        testObj.map = mockMap;
        testObj.currentPosition = startingPosition;

        testObj.move(DIRECTION.NORTH);

        assertEquals(mockMap.directionProvided, DIRECTION.NORTH);
        assertEquals(startingPosition, mockMap.startingPosition);

        assertEquals(mockMap.STUBBED_NEW_POSITION, testObj.currentPosition);
    }

    //Simple test here, since conditions are tested in Cucumber
    @Test
    public void moveIncrementsMoveCount() {
        int arbitrary_starting_move_count = 32;
        int arbitrary_expected_move_count = arbitrary_starting_move_count+1;

        Character testObj = new Character();
        FakeGameMap mockMap = new FakeGameMap();
        Position startingPosition = new Position(5,0);
        
        testObj.map = mockMap;
        testObj.currentPosition = startingPosition;
        testObj.moveCount = arbitrary_starting_move_count;

        testObj.move(DIRECTION.SOUTH);
        assertEquals(arbitrary_expected_move_count, testObj.getMoveCount());
    }

}