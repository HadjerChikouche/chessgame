package io.omt.chessgame.domain.entities;

public enum ColorTeamEnum {
    Black("BLACK"), White("WHITE");

    private String colorName;

    ColorTeamEnum(String colorName) {
        this.colorName = colorName;
    }

    public String toString(){
        return colorName;
    }
}
