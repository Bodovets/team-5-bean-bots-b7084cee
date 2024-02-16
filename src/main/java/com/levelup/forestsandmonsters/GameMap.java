package com.levelup.forestsandmonsters;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController.DIRECTION;
import com.levelup.model.Position;

 public class GameMap {

    Position[][] positions;
    public final Position startingPosition = new Position(0,0);
    public final int numPositions = 100;

    public GameMap() {
        positions = new Position[10][10];

        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < 10; j++)
            {
                Position p = new Position(i, j);
                positions[i][j] = p;
            }
        }
    }

    public Position[][] getPositions() {
        return positions;
    }

    public Position calculatePosition(Position startingPosition, DIRECTION direction) {
        int calculatedX = startingPosition.getX();
        int calculatedY = startingPosition.getX();

        if(direction.equals(DIRECTION.NORTH)){
            calculatedY = calculatedY + 1;
        }
        if(direction.equals(DIRECTION.SOUTH)){
            calculatedY = calculatedY - 1;
        }
        if (direction.equals(DIRECTION.WEST)) {
            calculatedX = calculatedX - 1;
        }
        if (direction.equals(DIRECTION.EAST)) {
            calculatedX = calculatedX + 1;
        }

        if(isPositionValid(new Point(calculatedX, calculatedY))){
            return this.positions[calculatedX][calculatedY];
        }
        else {
            return startingPosition;
        }
    }

    boolean isPositionValid(Point positionCoordinates) {
        if(positionCoordinates.x < 0 || positionCoordinates.x > 9)
            return false;
        else if (positionCoordinates.y < 0 || positionCoordinates.y > 9)
            return false;
        else 
            return true;
    }

    public int getTotalPositions() {
        return numPositions;
    }

}