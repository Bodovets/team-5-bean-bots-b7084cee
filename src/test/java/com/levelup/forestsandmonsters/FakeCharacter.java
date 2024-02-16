package com.levelup.forestsandmonsters;
import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.model.Character;
import com.levelup.model.Position;

public class FakeCharacter extends Character {

    DIRECTION directionProvided;
    Position STUBBED_NEW_POSITION = new Position(4,3);
    
    @Override
    public void move(DIRECTION direction) {
        this.directionProvided = direction;
        this.currentPosition = STUBBED_NEW_POSITION;
    }


    @Override
    public void enterMap(GameMap m) {
        this.currentPosition = STUBBED_NEW_POSITION;
    }
}