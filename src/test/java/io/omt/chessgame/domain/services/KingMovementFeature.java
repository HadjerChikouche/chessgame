package io.omt.chessgame.domain.services;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.omt.chessgame.domain.entities.*;
import org.junit.Assert;


public class KingMovementFeature {

    private Board board;
    private SquareFactory squareFactory = SquareFactory.getInstance();
    private PieceFactory pieceFactory = PieceFactory.getInstance();
    private PlayerFactory playerFactory = PlayerFactory.getInstance();

    @Given("^there is an empty square next to the king$")
    public void thereIsAnEmptySquareNextToTheKing() throws Throwable {

        board = Board.getInstance(playerFactory.getWhitePlayer("Amine","Chikouche"), playerFactory.getBlackPlayer("Hadjer","Chikouche"));

        board.poseAPiece(pieceFactory.getWhiteKing(), squareFactory.getSquareF5());
        Assert.assertTrue(board.isEmptySquare(squareFactory.getSquareF6()));
    }

    @When("^the player tries to move the king to this square$")
    public void thePlayerTriesToMoveTheKingToThisSquare() throws Throwable {
        Square from = squareFactory.getSquareF5();
        Square to = squareFactory.getSquareF6();
        board.movePeace(from,to);
    }

    @Then("^the king moves there$")
    public void theKingMovesThere() throws Throwable {
        Assert.assertEquals(pieceFactory.getWhiteKing(), board.getSquarePiece(squareFactory.getSquareF6()));
    }

    @Given("^a square with white piece next to the king$")
    public void aSquareWithWhitePieceNextToTheKing() throws Throwable {

        board = Board.getInstance(playerFactory.getWhitePlayer("Amine","Chikouche"), playerFactory.getBlackPlayer("Hadjer","Chikouche"));
        board.poseAPiece(pieceFactory.getWhiteKing(), squareFactory.getSquareF5());
        board.poseAPiece(pieceFactory.getWhitePawn1(), squareFactory.getSquareF4());
        Assert.assertEquals(board.getSquarePiece(squareFactory.getSquareF4()), pieceFactory.getWhitePawn1());
        Assert.assertEquals(board.getSquarePiece(squareFactory.getSquareF5()), pieceFactory.getWhiteKing());
    }

    @Then("^the king can't move to the square$")
    public void theKingCanTMoveToTheSquareAndWarningMessageAppears() throws Throwable {
        Assert.assertEquals(board.getSquarePiece(squareFactory.getSquareF4()), pieceFactory.getWhitePawn1());
        Assert.assertEquals(board.getSquarePiece(squareFactory.getSquareF5()), pieceFactory.getWhiteKing());
    }


}
