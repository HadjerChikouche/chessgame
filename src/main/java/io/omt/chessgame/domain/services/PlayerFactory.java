package io.omt.chessgame.domain.services;


import io.omt.chessgame.domain.entities.ColorTeamEnum;
import io.omt.chessgame.domain.entities.Player;

public class PlayerFactory {

    private static PlayerFactory INSTANCE = null;
    private static Player blackPlayer = null;
    private static Player whitePlayer = null;

    private PlayerFactory(){
    }

    public static PlayerFactory getInstance(){
        if(INSTANCE == null){
            INSTANCE = new PlayerFactory();
        }
        return INSTANCE;
    }

    public Player getWhitePlayer(String firstName, String lastName){
        if(whitePlayer == null){
            whitePlayer = new Player(ColorTeamEnum.White, firstName, lastName);
        }
        return whitePlayer;
    }

    public Player getBlackPlayer(String firstName, String lastName){
        if(blackPlayer == null){
            blackPlayer = new Player(ColorTeamEnum.Black, firstName, lastName);
        }
        return blackPlayer;
    }


}
