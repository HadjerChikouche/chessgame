package io.omt.chessgame.domain.services;


import io.omt.chessgame.domain.entities.ColorTeamEnum;
import io.omt.chessgame.domain.entities.Piece;
import io.omt.chessgame.domain.entities.PieceType;

public class PieceFactory {

    private static PieceFactory INSTANCE;

    private Piece whiteKing;
    private Piece whiteQueen;
    private Piece whiteKnight;
    private Piece whiteRook;
    private Piece whiteBishop;

    private Piece whitePawn1;
    private Piece whitePawn2;
    private Piece whitePawn3;
    private Piece whitePawn4;
    private Piece whitePawn5;
    private Piece whitePawn6;
    private Piece whitePawn7;
    private Piece whitePawn8;

    private Piece blackKing;
    private Piece blackQueen;
    private Piece blackKnight;
    private Piece blackRook;
    private Piece blackBishop;

    private Piece blackPawn1;
    private Piece blackPawn2;
    private Piece blackPawn3;
    private Piece blackPawn4;
    private Piece blackPawn5;
    private Piece blackPawn6;
    private Piece blackPawn7;
    private Piece blackPawn8;

    private PieceFactory(){

    }

    public static PieceFactory getInstance() {
        if(INSTANCE == null){
            INSTANCE = new PieceFactory();
        }
        return INSTANCE;
    }

    public Piece getWhiteKing(){
        if(whiteKing == null){
            whiteKing = new Piece(ColorTeamEnum.White, PieceType.King);
        }
        return whiteKing;
    }

    public Piece getWhiteQueen(){
        if(whiteQueen == null){
            whiteQueen = new Piece(ColorTeamEnum.White, PieceType.Queen);
        }
        return whiteQueen;
    }

    public Piece getWhiteKnight(){
        if(whiteKnight == null){
            whiteKnight = new Piece(ColorTeamEnum.White, PieceType.Knight);
        }
        return whiteKnight;
    }

    public Piece getWhiteRook(){
        if(whiteRook == null){
            whiteRook = new Piece(ColorTeamEnum.White, PieceType.Rook);
        }
        return whiteRook;
    }

    public Piece getWhiteBishop(){
        if(whiteBishop == null){
            whiteBishop = new Piece(ColorTeamEnum.White, PieceType.Bishop);
        }
        return whiteBishop;
    }

    public Piece getWhitePawn1(){
        if(whitePawn1 == null){
            whitePawn1 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn1;
    }

    public Piece getWhitePawn2(){
        if(whitePawn2 == null){
            whitePawn2 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn2;
    }

    public Piece getWhitePawn3(){
        if(whitePawn3 == null){
            whitePawn3 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn3;
    }

    public Piece getWhitePawn4(){
        if(whitePawn4 == null){
            whitePawn4 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn4;
    }

    public Piece getWhitePawn5(){
        if(whitePawn5 == null){
            whitePawn5 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn5;
    }

    public Piece getWhitePawn6(){
        if(whitePawn6 == null){
            whitePawn6 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn6;
    }

    public Piece getWhitePawn7(){
        if(whitePawn7 == null){
            whitePawn7 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn7;
    }

    public Piece getWhitePawn8(){
        if(whitePawn8 == null){
            whitePawn8 = new Piece(ColorTeamEnum.White, PieceType.Pawn);
        }
        return whitePawn8;
    }

    public Piece getBlackKing(){
        if(blackKing == null){
            blackKing = new Piece(ColorTeamEnum.Black, PieceType.King);
        }
        return blackKing;
    }

    public Piece getBlackQueen(){
        if(blackQueen == null){
            blackQueen = new Piece(ColorTeamEnum.Black, PieceType.Queen);
        }
        return blackQueen;
    }

    public Piece getBlackKnight(){
        if(blackKnight == null){
            blackKnight = new Piece(ColorTeamEnum.Black, PieceType.Knight);
        }
        return blackKnight;
    }

    public Piece getBlackRook(){
        if(blackRook == null){
            blackRook = new Piece(ColorTeamEnum.Black, PieceType.Rook);
        }
        return blackRook;
    }

    public Piece getBlackBishop(){
        if(blackBishop == null){
            blackBishop = new Piece(ColorTeamEnum.Black, PieceType.Bishop);
        }
        return blackBishop;
    }

    public Piece getBlackPawn1(){
        if(blackPawn1 == null){
            blackPawn1 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn1;
    }

    public Piece getBlackPawn2(){
        if(blackPawn2 == null){
            blackPawn2 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn2;
    }

    public Piece getBlackPawn3(){
        if(blackPawn3 == null){
            blackPawn3 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn3;
    }

    public Piece getBlackPawn4(){
        if(blackPawn4 == null){
            blackPawn4 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn4;
    }

    public Piece getBlackPawn5(){
        if(blackPawn5 == null){
            blackPawn5 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn5;
    }

    public Piece getBlackPawn6(){
        if(blackPawn6 == null){
            blackPawn6 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn6;
    }

    public Piece getBlackPawn7(){
        if(blackPawn7 == null){
            blackPawn7 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn7;
    }

    public Piece getBlackPawn8(){
        if(blackPawn8 == null){
            blackPawn8 = new Piece(ColorTeamEnum.Black, PieceType.Pawn);
        }
        return blackPawn8;
    }
}
