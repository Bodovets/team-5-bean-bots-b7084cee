package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StartGameSteps {

    GameController testObj;

    @When("the game is started")
    public void whenTheCharacterSetsTheirName() {
        testObj = new GameController();
        testObj.startGame();
    }

    @Then("the Game has {int} positions")
    public void thenTheGameSetsTheCharactersName(int numPositions) {
        assertEquals(numPositions, testObj.getTotalPositions());
    }

    @Then("the Game sets the character's X position to {int}")
    public void checkXPosition(int xPosition)
    {
        assertEquals(xPosition, testObj.getStatus().currentPosition.x);
    }

    @Then("the Game sets the character's Y position to {int}")
    public void checkYPosition(int yPosition) 
    {
        assertEquals(yPosition, testObj.getStatus().currentPosition.y);
    }

    @Then("the move count is {int}")
    public void checkMoveCount(int moveCount) 
    {
        assertEquals(moveCount, testObj.getStatus().moveCount);
    }

}
