package io.omt.chessgame.domain.services;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.omt.chessgame.domain.entities.Board;
import io.omt.chessgame.domain.entities.Square;
import org.junit.Assert;

public class KingCaptureFeature {
    private Board board;
    private SquareFactory squareFactory = SquareFactory.getInstance();
    private PieceFactory pieceFactory = PieceFactory.getInstance();
    private PlayerFactory playerFactory = PlayerFactory.getInstance();

    @Given("^there is a black bishop in a square next to the white king$")
    public void thereIsABlackBishopInASquareNextToTheWhiteKing() throws Throwable {
        board.poseAPiece(pieceFactory.getBlackBishop(),squareFactory.getSquareE5());
        board.poseAPiece(pieceFactory.getWhiteKing(),squareFactory.getSquareF4());
        Assert.assertEquals(pieceFactory.getWhiteKing(), board.getSquarePiece(squareFactory.getSquareF4()));
        Assert.assertEquals(pieceFactory.getBlackBishop(), board.getSquarePiece(squareFactory.getSquareE5()));
    }

    @When("^the player tries to move the white king to this square$")
    public void thePlayerTriesToMoveTheWhiteKingToThisSquare() throws Throwable {
        Square from = squareFactory.getSquareF4();
        Square to = squareFactory.getSquareE5();
        board.movePeace(from,to);
    }


    @Then("^the white king moves there and captures the black bishop$")
    public void theWhiteKingMovesThereAndCapturesTheBlackBishop() throws Throwable {
        Assert.assertEquals(pieceFactory.getWhiteKing(), board.getSquarePiece(squareFactory.getSquareF5()));
    }
}
