package com.levelup.forestsandmonsters.cli;

import java.util.ArrayList;
import java.util.List;

import com.levelup.forestsandmonsters.GameController;
import com.levelup.forestsandmonsters.GameController.GameStatus;
import java.awt.Point;

import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.standard.commands.Quit;

@ShellComponent
public class LevelUpGame implements Quit.Command {

  private final GameController gameController;
  private List<GameStatus> gameHistory;
  private boolean isGameStarted = false;

  public LevelUpGame() {
    super();
    this.gameController = new GameController();
    this.gameHistory = new ArrayList<GameStatus>();
  }

  @ShellMethodAvailability("notStartedCheck")
  @ShellMethod(value = "Create a character (characterName)", key = { "create-character", "create" })
  public void createCharacter(@ShellOption(defaultValue = "Player") String characterName) {
    gameController.createCharacter(characterName);
    GameStatus status = gameController.getStatus();

    System.out.println("Your character, " + status.characterName + " is created!");
  }

  @ShellMethodAvailability("notStartedCheck")
  @ShellMethod("Start the game")
  public void startGame() {
    isGameStarted = true;
    gameController.startGame();
    GameStatus status = gameController.getStatus();

    System.out.println("Welcome to Forests and Monsters! You have entered a mysterious place.");
    System.out.println(status.characterName + " is on position " + status.currentPosition.x + "," + status.currentPosition.y);
    System.out.println("Would you like to go North(N), South(S), East(E), West(W) or Exit(X)?");
  }

  @ShellMethod(value = "Move North", key = { "N", "n" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveNorth() {
    gameController.move(GameController.DIRECTION.NORTH);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move South", key = { "S", "s" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveSouth() {
    gameController.move(GameController.DIRECTION.SOUTH);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move East", key = { "E", "e" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveEast() {
    gameController.move(GameController.DIRECTION.EAST);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "Move West", key = { "W", "w" }, group = "Move")
  @ShellMethodAvailability("startedCheck")
  public void moveWest() {
    gameController.move(GameController.DIRECTION.WEST);
    updateStatus(gameController.getStatus());
  }

  @ShellMethod(value = "End the game", key = { "X", "x" })
  public void endGame() {
    System.out.println("You exit the mysterious world.");
    printSummary();
    System.exit(0);
  }

  private void printSummary() {
    if (!gameHistory.isEmpty() && isGameStarted) {
      Point startingPosition = gameHistory.get(0).currentPosition;
      Point endingPosition = this.gameController.getStatus().currentPosition;
      System.out.println("You started on " + startingPosition.x + "," + startingPosition.y);
      System.out.println("...and ended on " + endingPosition.x + "," + endingPosition.y);
      System.out.println("Number of moves taken:" + gameHistory.size());
    }
    else if (isGameStarted) {
      System.out.println("You started and edned on " + this.gameController.getStatus().currentPosition.x + "," + this.gameController.getStatus().currentPosition.y);
      System.out.println("You didn't move at all!");
    }
    else {
      System.out.println("You left before you began!");
    }
  

  }

  private void updateStatus(GameStatus status) {
    this.gameHistory.add(status);
    System.out
        .println(status.characterName + " is on position " + status.currentPosition.x + "," + status.currentPosition.y);
  }

  public Availability startedCheck() {
    return isGameStarted
        ? Availability.available()
        : Availability.unavailable("game not started");
  }

  public Availability notStartedCheck() {
    return !isGameStarted
        ? Availability.available()
        : Availability.unavailable("game already started");
  }

}
