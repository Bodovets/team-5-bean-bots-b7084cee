package com.levelup.model;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.levelup.forestsandmonsters.GameController;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GameStatusTest {


    // GameStatus gameStatus;
    // String characterName;

    // @Given("player supplies the name {string}")
    // public void givenTheCharactersNameIs(String characterName) {
    //     this.characterName = characterName;
    // }

    // @When("the character is created and characterName is set")
    // public void whenTheCharacterSetsTheirName() {
    //     gameStatus = new GameStatus();
    //     gameStatus.setCharacterName(characterName);
    // }

    // @Then("the GameStatus has the character name {string}")
    // public void thenTheGameSetsTheCharactersName(String expectedName) {
    //     assertEquals(expectedName, gameStatus.getCharacterName());
    // }

    @Test
    void getCharacterNameTest () {
        GameStatus gameStatus = new GameStatus();
        gameStatus.setCharacterName("Vlad");
        assertNotNull(gameStatus.getCharacterName());
    }

    @Test
    void setAndGetCharacterNameTest () {
        GameStatus gameStatus = new GameStatus();
        String name = "Joe";
        gameStatus.setCharacterName(name);
        assertEquals(name, gameStatus.getCharacterName());
    }
    
    @Test
    void getCurrentPositionXTest () {
        GameStatus gameStatus = new GameStatus();
        assertNotNull(gameStatus.getCurrentPositionX());
    }
    @Test
    void setCurrentPositionXTest () {
        GameStatus gameStatus = new GameStatus();
        int currentPositionX = 3;
        gameStatus.setCurrentPositionX(currentPositionX);
        assertNotNull(gameStatus.getCurrentPositionX());
    }

    @Test
    void setAndGetCurrentPositionXTest () {
        GameStatus gameStatus = new GameStatus();
        int currentPositionX = 3;
        gameStatus.setCurrentPositionX(currentPositionX);
        assertEquals(currentPositionX, gameStatus.getCurrentPositionX());
    }
}
