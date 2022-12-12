package com.yemeksepeti.interfacechallenge;

public class TestMovable {
    public static void main(String[] args) {
        MoveImpl move = new MoveImpl(0, 0);
        move.moveDown();
        move.moveUp();
        move.moveUp();
        move.moveUp();
        move.moveLeft();
        move.moveLeft();
        move.moveRight();
    }
}
