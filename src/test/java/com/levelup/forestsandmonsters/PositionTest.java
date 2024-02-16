package com.levelup.forestsandmonsters;
import org.junit.Test;

import com.levelup.model.Position;


import static org.junit.Assert.assertEquals;


public class PositionTest {
    @Test
    public void initializationSetsCoordinates() {
        Position testObj = new Position(0, 4);
        assertEquals(0, testObj.coordinates.x);
    
    }

}