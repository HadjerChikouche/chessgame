package io.omt.chessgame.domain.services;


import io.omt.chessgame.domain.entities.Square;
import io.omt.chessgame.domain.entities.Xposition;
import io.omt.chessgame.domain.entities.Yposition;

public class SquareFactory {

    private static SquareFactory INSTANCE;

    private Square a1;
    private Square a2;
    private Square a3;
    private Square a4;
    private Square a5;
    private Square a6;
    private Square a7;
    private Square a8;

    private Square b1;
    private Square b2;
    private Square b3;
    private Square b4;
    private Square b5;
    private Square b6;
    private Square b7;
    private Square b8;

    private Square c1;
    private Square c2;
    private Square c3;
    private Square c4;
    private Square c5;
    private Square c6;
    private Square c7;
    private Square c8;

    private Square d1;
    private Square d2;
    private Square d3;
    private Square d4;
    private Square d5;
    private Square d6;
    private Square d7;
    private Square d8;

    private Square e1;
    private Square e2;
    private Square e3;
    private Square e4;
    private Square e5;
    private Square e6;
    private Square e7;
    private Square e8;

    private Square f1;
    private Square f2;
    private Square f3;
    private Square f4;
    private Square f5;
    private Square f6;
    private Square f7;
    private Square f8;

    private Square g1;
    private Square g2;
    private Square g3;
    private Square g4;
    private Square g5;
    private Square g6;
    private Square g7;
    private Square g8;

    private Square h1;
    private Square h2;
    private Square h3;
    private Square h4;
    private Square h5;
    private Square h6;
    private Square h7;
    private Square h8;

    private SquareFactory(){
    }

    public static SquareFactory getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new SquareFactory();
        }
        return INSTANCE;
    }

    public Square getSquareA1() {
        if(a1 == null){
            a1 = new Square(Xposition.a, Yposition._1);
        }
        return a1;
    }

    public Square getSquareA2() {
        if(a2 == null){
            a2 = new Square(Xposition.a, Yposition._2);
        }
        return a2;
    }

    public Square getSquareA3() {
        if(a3 == null){
            a3 = new Square(Xposition.a, Yposition._3);
        }
        return a3;
    }

    public Square getSquareA4() {
        if(a4 == null){
            a4 = new Square(Xposition.a, Yposition._4);
        }
        return a4;
    }

    public Square getSquareA5() {
        if(a5 == null){
            a5 = new Square(Xposition.a, Yposition._5);
        }
        return a5;
    }

    public Square getSquareA6() {
        if(a6 == null){
            a6 = new Square(Xposition.a, Yposition._6);
        }
        return a6;
    }

    public Square getSquareA7() {
        if(a7 == null){
            a7 = new Square(Xposition.a, Yposition._7);
        }
        return a7;
    }

    public Square getSquareA8() {
        if(a8 == null){
            a8 = new Square(Xposition.a, Yposition._8);
        }
        return a8;
    }

    public Square getSquareB1() {
        if(b1 == null){
            b1 = new Square(Xposition.b, Yposition._1);
        }
        return b1;
    }

    public Square getSquareB2() {
        if(b2 == null){
            b2 = new Square(Xposition.b, Yposition._2);
        }
        return b2;
    }

    public Square getSquareB3() {
        if(b3 == null){
            b3 = new Square(Xposition.b, Yposition._3);
        }
        return b3;
    }

    public Square getSquareB4() {
        if(b4 == null){
            b4 = new Square(Xposition.b, Yposition._4);
        }
        return b4;
    }

    public Square getSquareB5() {
        if(b5 == null){
            b5 = new Square(Xposition.b, Yposition._5);
        }
        return b5;
    }

    public Square getSquareB6() {
        if(b6 == null){
            b6 = new Square(Xposition.b, Yposition._6);
        }
        return b6;
    }

    public Square getSquareB7() {
        if(b7 == null){
            b7 = new Square(Xposition.b, Yposition._7);
        }
        return b7;
    }

    public Square getSquareB8() {
        if(b8 == null){
            b8 = new Square(Xposition.b, Yposition._8);
        }
        return b8;
    }

    public Square getSquareC1() {
        if(c1 == null){
            c1 = new Square(Xposition.c, Yposition._1);
        }
        return c1;
    }

    public Square getSquareC2() {
        if(c2 == null){
            c2 = new Square(Xposition.c, Yposition._2);
        }
        return c2;
    }

    public Square getSquareC3() {
        if(c3 == null){
            c3 = new Square(Xposition.c, Yposition._3);
        }
        return c3;
    }

    public Square getSquareC4() {
        if(c4 == null){
            c4 = new Square(Xposition.c, Yposition._4);
        }
        return c4;
    }

    public Square getSquareC5() {
        if(c5 == null){
            c5 = new Square(Xposition.c, Yposition._5);
        }
        return c5;
    }

    public Square getSquareC6() {
        if(c6 == null){
            c6 = new Square(Xposition.c, Yposition._6);
        }
        return c6;
    }

    public Square getSquareC7() {
        if(c7 == null){
            c7 = new Square(Xposition.c, Yposition._7);
        }
        return c7;
    }

    public Square getSquareC8() {
        if(c8 == null){
            c8 = new Square(Xposition.c, Yposition._8);
        }
        return c8;
    }

    public Square getSquareD1() {
        if(d1 == null){
            d1 = new Square(Xposition.d, Yposition._1);
        }
        return d1;
    }

    public Square getSquareD2() {
        if(d2 == null){
            d2 = new Square(Xposition.d, Yposition._2);
        }
        return d2;
    }

    public Square getSquareD3() {
        if(d3 == null){
            d3 = new Square(Xposition.d, Yposition._3);
        }
        return d3;
    }

    public Square getSquareD4() {
        if(d4 == null){
            d4 = new Square(Xposition.d, Yposition._4);
        }
        return d4;
    }

    public Square getSquareD5() {
        if(d5 == null){
            d5 = new Square(Xposition.d, Yposition._5);
        }
        return d5;
    }

    public Square getSquareD6() {
        if(d6 == null){
            d6 = new Square(Xposition.d, Yposition._6);
        }
        return d6;
    }

    public Square getSquareD7() {
        if(d7 == null){
            d7 = new Square(Xposition.d, Yposition._7);
        }
        return d7;
    }

    public Square getSquareD8() {
        if(d8 == null){
            d8 = new Square(Xposition.d, Yposition._8);
        }
        return d8;
    }

    public Square getSquareE1() {
        if(e1 == null){
            e1 = new Square(Xposition.e, Yposition._1);
        }
        return e1;
    }

    public Square getSquareE2() {
        if(e2 == null){
            e2 = new Square(Xposition.e, Yposition._2);
        }
        return e2;
    }

    public Square getSquareE3() {
        if(e3 == null){
            e3 = new Square(Xposition.e, Yposition._3);
        }
        return e3;
    }

    public Square getSquareE4() {
        if(e4 == null){
            e4 = new Square(Xposition.e, Yposition._4);
        }
        return e4;
    }

    public Square getSquareE5() {
        if(e5 == null){
            e5 = new Square(Xposition.e, Yposition._5);
        }
        return e5;
    }

    public Square getSquareE6() {
        if(e6 == null){
            e6 = new Square(Xposition.e, Yposition._6);
        }
        return e6;
    }

    public Square getSquareE7() {
        if(e7 == null){
            e7 = new Square(Xposition.e, Yposition._7);
        }
        return e7;
    }

    public Square getSquareE8() {
        if(e8 == null){
            e8 = new Square(Xposition.e, Yposition._8);
        }
        return e8;
    }

    public Square getSquareF1() {
        if(f1 == null){
            f1 = new Square(Xposition.f, Yposition._1);
        }
        return f1;
    }

    public Square getSquareF2() {
        if(f2 == null){
            f2 = new Square(Xposition.f, Yposition._2);
        }
        return f2;
    }

    public Square getSquareF3() {
        if(f3 == null){
            f3 = new Square(Xposition.f, Yposition._3);
        }
        return f3;
    }

    public Square getSquareF4() {
        if(f4 == null){
            f4 = new Square(Xposition.f, Yposition._4);
        }
        return f4;
    }

    public Square getSquareF5() {
        if(f5 == null){
            f5 = new Square(Xposition.f, Yposition._5);
        }
        return f5;
    }

    public Square getSquareF6() {
        if(f6 == null){
            f6 = new Square(Xposition.f, Yposition._6);
        }
        return f6;
    }

    public Square getSquareF7() {
        if(f7 == null){
            f7 = new Square(Xposition.f, Yposition._7);
        }
        return f7;
    }

    public Square getSquareF8() {
        if(f8 == null){
            f8 = new Square(Xposition.f, Yposition._8);
        }
        return f8;
    }

    public Square getSquareG1() {
        if(g1 == null){
            g1 = new Square(Xposition.g, Yposition._1);
        }
        return g1;
    }

    public Square getSquareG2() {
        if(g2 == null){
            g2 = new Square(Xposition.g, Yposition._2);
        }
        return g2;
    }

    public Square getSquareG3() {
        if(g3 == null){
            g3 = new Square(Xposition.g, Yposition._3);
        }
        return g3;
    }

    public Square getSquareG4() {
        if(g4 == null){
            g4 = new Square(Xposition.g, Yposition._4);
        }
        return g4;
    }

    public Square getSquareG5() {
        if(g5 == null){
            g5 = new Square(Xposition.g, Yposition._5);
        }
        return g5;
    }

    public Square getSquareG6() {
        if(g6 == null){
            g6 = new Square(Xposition.g, Yposition._6);
        }
        return g6;
    }

    public Square getSquareG7() {
        if(g7 == null){
            g7 = new Square(Xposition.g, Yposition._7);
        }
        return g7;
    }

    public Square getSquareG8() {
        if(g8 == null){
            g8 = new Square(Xposition.g, Yposition._8);
        }
        return g8;
    }

    public Square getSquareH1() {
        if(h1 == null){
            h1 = new Square(Xposition.h, Yposition._1);
        }
        return h1;
    }

    public Square getSquareH2() {
        if(h2 == null){
            h2 = new Square(Xposition.h, Yposition._2);
        }
        return h2;
    }

    public Square getSquareH3() {
        if(h3 == null){
            h3 = new Square(Xposition.h, Yposition._3);
        }
        return h3;
    }

    public Square getSquareH4() {
        if(h4 == null){
            h4 = new Square(Xposition.h, Yposition._4);
        }
        return h4;
    }

    public Square getSquareH5() {
        if(h5 == null){
            h5 = new Square(Xposition.h, Yposition._5);
        }
        return h5;
    }

    public Square getSquareH6() {
        if(h6 == null){
            h6 = new Square(Xposition.h, Yposition._6);
        }
        return h6;
    }

    public Square getSquareH7() {
        if(h7 == null){
            h7 = new Square(Xposition.h, Yposition._7);
        }
        return h7;
    }

    public Square getSquareH8() {
        if(h8 == null){
            h8 = new Square(Xposition.h, Yposition._8);
        }
        return h8;
    }
}
