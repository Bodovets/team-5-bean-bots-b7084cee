package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.cli.Position;

import org.junit.Test;


public class PositionTest {
    @Test
    public void testPosition() {
        Position position = new Position(0, 0);
        assert (position.getX() == 0);
        assert (position.getY() == 0);
    }

    @Test
    public void testPosition2() {
        Position position = new Position(5, 6);
        assert (position.getX() == 5);
        assert (position.getY() == 6);
    }
}
