package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.model.Position;


public class FakeGameMap extends GameMap {

    DIRECTION directionProvided;
    Position startingPosition;
    Position STUBBED_NEW_POSITION = new Position(4,3);
    
    @Override
    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        this.directionProvided = direction;
        this.startingPosition = startingPosition;

        return STUBBED_NEW_POSITION;
    }

}