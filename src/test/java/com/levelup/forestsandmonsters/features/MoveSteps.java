package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {

    GameController testObj = new GameController();
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;

    @Given("the character starts at position with XCoordinates {int}")
    public void givenTheCharacterStartsAtX(int startX) {
        this.startX = startX;
    }

    @Given("starts at YCoordinates {int}") 
    public void givenTheCharacterStartsAtY(int startY) {
        this.startY = startY;
    }

    @Given("the player chooses to move in {word}")
    public void givenCharacterChoosesDirection(String direction) {
        this.direction = GameController.DIRECTION.valueOf(direction);
    }


    @Then("the character is now at position with XCoordinates {int}")
    public void checkXCoordinates(int endX) {
        assertNotNull("Expected position not null", this.currentPosition) ;
        assertEquals(endX, this.currentPosition.x);
    }

    @Then("YCoordinates {int}")
    public void checkYCoordinates(int endY) {
        assertNotNull("Expected position not null", this.currentPosition);
        assertEquals(endY, this.currentPosition.y);
    }

    @Then("the new move count is {int}")
    public void checkMoveCount(int endingMoveCount) {
        assertEquals(endingMoveCount, testObj.getStatus().moveCount);
    }

}
