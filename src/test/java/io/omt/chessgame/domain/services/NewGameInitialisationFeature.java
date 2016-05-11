package io.omt.chessgame.domain.services;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.omt.chessgame.domain.entities.Board;
import io.omt.chessgame.domain.entities.ColorTeamEnum;
import io.omt.chessgame.domain.entities.Player;
import org.junit.Assert;


public class NewGameInitialisationFeature {

    Player whitePlayer;
    Player blackPlayer;
    Board board;

    @Given("^two players$")
    public void twoPlayers() throws Throwable {
        whitePlayer = new Player(ColorTeamEnum.White,"Amine","Chikouche");
        blackPlayer = new Player(ColorTeamEnum.Black,"Hadjer","Chikouche");
        Assert.assertNotNull(whitePlayer);
        Assert.assertNotNull(blackPlayer);
    }

    @When("^the Active player initialise a game$")
    public void theActivePlayerInitialiseAGame() throws Throwable {
        board = Board.getInstance(whitePlayer, blackPlayer);
        Assert.assertNotNull(board);
    }

    @Then("^the board will be initialised$")
    public void theBoardWillBeInitialised() throws Throwable {
        Assert.assertEquals("Board{" + whitePlayer.toString() + "\n" + blackPlayer.toString() + "}",board.toString());
    }
}
