package io.omt.chessgame.domain.entities;

public class Piece implements TeamColor{

    private final ColorTeamEnum color;
    private final PieceType pieceType;

    public Piece(final ColorTeamEnum color, PieceType pieceType) {
        this.color = color;
        this.pieceType = pieceType;
    }

    @Override
    public boolean isWhite() {
        if(color.equals(ColorTeamEnum.White)){
            return true;
        }
        return false;
    }

    @Override
    public boolean isBlack() {
        if(color.equals(ColorTeamEnum.Black)){
            return true;
        }
        return false;
    }
}
