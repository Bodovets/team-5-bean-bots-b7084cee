package com.levelup.forestsandmonsters.features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.awt.Point;

public class StartGameSteps {

    GameController gc;

    @When("the game is started")
    public void the_game_is_started() {
        gc = new GameController();
        gc.startGame();
    }

    @Then("the map is initialized with number of positions {int}")
    public void the_map_is_initialized_with_num_positions_positions(int numPositions) {
        assertEquals(numPositions, gc.getTotalPositions());
    }

    @Then("the character is at the starting position {word}")
    public void the_character_is_at_the_starting_position_character_starting_position(String coordinatesString) {
        String[] coordinates = coordinatesString.split(",");
        int x = Integer.parseInt(coordinates[0]);
        int y = Integer.parseInt(coordinates[1]);

        Point expectedCoordinates = new Point(x,y);
        assertEquals(expectedCoordinates, gc.getStatus().currentPosition);
    }
    
}