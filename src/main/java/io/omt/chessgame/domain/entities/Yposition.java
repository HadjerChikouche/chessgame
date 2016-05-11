package io.omt.chessgame.domain.entities;

public enum Yposition {
    _1("1"),_2("2"),_3("3"),_4("4"),_5("5"),_6("6"),_7("7"),_8("8");

    private final String yPositionName;

    Yposition(String yPositionName) {
        this.yPositionName = yPositionName;
    }

    @Override
    public String toString() {
        return yPositionName;
    }
}
