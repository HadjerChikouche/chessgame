package io.omt.chessgame.domain.entities;

import io.omt.chessgame.domain.services.SquareFactory;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private final Map<Square,Piece> boardList;
    private final Player whitePlayer;
    private final Player blackPlayer;

    private static Board INSTANCE = null;


    public static Board getInstance(Player whitePlayer, Player blackPlayer) throws Exception {

        if(whitePlayer == null || blackPlayer == null){
            throw new Exception("Can't start a game without two players");
        }

        if(INSTANCE == null){
            INSTANCE = new Board(whitePlayer, blackPlayer);
        }
        return INSTANCE;
    }


    private Board(final Player whitePlayer, final Player blackPlayer){

        this.whitePlayer = whitePlayer;
        this.blackPlayer = blackPlayer;

        SquareFactory squareFactory = SquareFactory.getInstance();

        boardList = new HashMap<>();
        boardList.put(squareFactory.getSquareA1(), null);
        boardList.put(squareFactory.getSquareA2(), null);
        boardList.put(squareFactory.getSquareA3(), null);
        boardList.put(squareFactory.getSquareA4(), null);
        boardList.put(squareFactory.getSquareA5(), null);
        boardList.put(squareFactory.getSquareA6(), null);
        boardList.put(squareFactory.getSquareA7(), null);
        boardList.put(squareFactory.getSquareA8(), null);

        boardList.put(squareFactory.getSquareB1(), null);
        boardList.put(squareFactory.getSquareB2(), null);
        boardList.put(squareFactory.getSquareB3(), null);
        boardList.put(squareFactory.getSquareB4(), null);
        boardList.put(squareFactory.getSquareB5(), null);
        boardList.put(squareFactory.getSquareB5(), null);
        boardList.put(squareFactory.getSquareB6(), null);
        boardList.put(squareFactory.getSquareB7(), null);

        boardList.put(squareFactory.getSquareC1(), null);
        boardList.put(squareFactory.getSquareC2(), null);
        boardList.put(squareFactory.getSquareC3(), null);
        boardList.put(squareFactory.getSquareC4(), null);
        boardList.put(squareFactory.getSquareC5(), null);
        boardList.put(squareFactory.getSquareC6(), null);
        boardList.put(squareFactory.getSquareC7(), null);
        boardList.put(squareFactory.getSquareC8(), null);

        boardList.put(squareFactory.getSquareD1(), null);
        boardList.put(squareFactory.getSquareD2(), null);
        boardList.put(squareFactory.getSquareD3(), null);
        boardList.put(squareFactory.getSquareD4(), null);
        boardList.put(squareFactory.getSquareD5(), null);
        boardList.put(squareFactory.getSquareD6(), null);
        boardList.put(squareFactory.getSquareD6(), null);
        boardList.put(squareFactory.getSquareD7(), null);

        boardList.put(squareFactory.getSquareE1(), null);
        boardList.put(squareFactory.getSquareE2(), null);
        boardList.put(squareFactory.getSquareE3(), null);
        boardList.put(squareFactory.getSquareE4(), null);
        boardList.put(squareFactory.getSquareE5(), null);
        boardList.put(squareFactory.getSquareE6(), null);
        boardList.put(squareFactory.getSquareE7(), null);
        boardList.put(squareFactory.getSquareE8(), null);

        boardList.put(squareFactory.getSquareF1(), null);
        boardList.put(squareFactory.getSquareF2(), null);
        boardList.put(squareFactory.getSquareF3(), null);
        boardList.put(squareFactory.getSquareF4(), null);
        boardList.put(squareFactory.getSquareF5(), null);
        boardList.put(squareFactory.getSquareF6(), null);
        boardList.put(squareFactory.getSquareF7(), null);
        boardList.put(squareFactory.getSquareF8(), null);

        boardList.put(squareFactory.getSquareG1(), null);
        boardList.put(squareFactory.getSquareG2(), null);
        boardList.put(squareFactory.getSquareG3(), null);
        boardList.put(squareFactory.getSquareG4(), null);
        boardList.put(squareFactory.getSquareG5(), null);
        boardList.put(squareFactory.getSquareG6(), null);
        boardList.put(squareFactory.getSquareG7(), null);
        boardList.put(squareFactory.getSquareG8(), null);

        boardList.put(squareFactory.getSquareH1(), null);
        boardList.put(squareFactory.getSquareH2(), null);
        boardList.put(squareFactory.getSquareH3(), null);
        boardList.put(squareFactory.getSquareH4(), null);
        boardList.put(squareFactory.getSquareH5(), null);
        boardList.put(squareFactory.getSquareH6(), null);
        boardList.put(squareFactory.getSquareH7(), null);
        boardList.put(squareFactory.getSquareH8(), null);
    }

    @Override
    public String toString() {
        return "Board{" + whitePlayer.toString() + "\n" + blackPlayer.toString() + "}";
    }

    public void poseAPiece(Piece piece, Square square) {
        boardList.putIfAbsent(square, piece);
    }

    public boolean isEmptySquare(Square square){
        if(boardList.get(square) == null){
            return true;
        }
        return false;
    }

    public void movePeace(Square from, Square to) {
        Piece piece = boardList.get(from);
        if(piece != null) {
            if (boardList.get(to) != null) {
                capturePiece(to);
            }
        }
        boardList.put(to, piece);
    }

    private void capturePiece(Square to) {
        boardList.put(to,null);
    }

    public Piece getSquarePiece(Square square){
        return boardList.get(square);
    }
}
