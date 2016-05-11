package io.omt.chessgame.domain.entities;

public class Player {

    private final ColorTeamEnum colorTeam;
    private final String firstName;
    private final String lastName;

    public Player(final ColorTeamEnum colorTeam, final String firstName, final String lastName) {
        this.colorTeam = colorTeam;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "colorTeam=" + colorTeam +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
