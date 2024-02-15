package com.levelup.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameStatusTest {
    
    GameStatus gameStatus;
    String characterName;

    @Given("player supplies the name {string}")
    public void givenTheCharactersNameIs(String characterName) {
        this.characterName = characterName;
    }

    @When("the character is created and characterName is set")
    public void whenTheCharacterSetsTheirName() {
        gameStatus = new GameStatus();
        gameStatus.setCharacterName(characterName);
    }

    @Then("the GameStatus has the character name {string}")
    public void thenTheGameSetsTheCharactersName(String expectedName) {
        assertEquals(expectedName, gameStatus.getCharacterName());
    }
}
