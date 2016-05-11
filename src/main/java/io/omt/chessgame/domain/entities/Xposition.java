package io.omt.chessgame.domain.entities;


public enum Xposition {
    a("a"),b("b"),c("c"),d("d"),e("e"),f("f"),g("g"),h("h");

    private final String positionName;

    Xposition(String positionName) {
        this.positionName = positionName;
    }

    @Override
    public String toString() {
        return positionName;
    }
}

