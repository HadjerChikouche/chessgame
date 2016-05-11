package io.omt.chessgame.domain.entities;

public enum PieceType {
    King("K"),Queen("Q"),Knight("N"),Pawn("P"),Rook("R"),Bishop("B");

    private final String abreviation;

    PieceType(String abreviation) {
        this.abreviation = abreviation;
    }
}
