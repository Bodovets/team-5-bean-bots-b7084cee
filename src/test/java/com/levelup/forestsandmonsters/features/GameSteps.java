package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameSteps {

    GameController gc;
    String characterName;

    @Given("the character's name is {string}")
    public void givenTheCharactersNameIs(String characterName) {
        this.characterName = characterName;
    }

    @When("the character sets their name")
    public void whenTheCharacterSetsTheirName() {
        gc = new GameController();
        gc.createCharacter(characterName);
    }

    @Then("the Game sets the character's name to {string}")
    public void thenTheGameSetsTheCharactersName(String expectedName) {
        assertEquals(expectedName, gc.getStatus().characterName);
    }

}
