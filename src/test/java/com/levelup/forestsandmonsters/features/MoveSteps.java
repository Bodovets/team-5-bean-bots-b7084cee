package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {

    GameController gc;
    int startX, startY, endX, endY;
    int startingMoveCount, endingMoveCount;
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

    @Given("the current move count is {int}")
    public void the_current_move_count_is_starting_move_count(int startingMoveCount) {
        this.startingMoveCount = startingMoveCount;
    }

    @Given("the player choses to move in {word}")
    public void givenPlayerChoosesDirection(String direction) {
        this.direction = GameController.DIRECTION.valueOf(direction);
    }

    @When("the character moves")
    public void theCharacterMoves() {
        gc = new GameController();
        gc.startGame();
        gc.setCharacterPositionAndMoveCount(new Point(this.startX, this.startY), this.startingMoveCount);
        gc.move(this.direction);
        GameController.GameStatus status = gc.getStatus();
        this.currentPosition = status.currentPosition;
        this.endingMoveCount = status.moveCount;
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

    @Then("the ending move count is {int}")
    public void the_ending_move_count_is(int endingMoveCount) {
        assertEquals(endingMoveCount, this.endingMoveCount);
    }

}
