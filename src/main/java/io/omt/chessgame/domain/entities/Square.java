package io.omt.chessgame.domain.entities;

public class Square {

    private final Xposition xPosition;

    private final Yposition yPosition;

    public Square(Xposition xPosition, Yposition yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    @Override
    public String toString() {
        return xPosition.toString() + yPosition.toString();
    }
}
