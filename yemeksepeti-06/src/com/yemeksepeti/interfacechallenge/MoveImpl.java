package com.yemeksepeti.interfacechallenge;

public class MoveImpl implements Movable{
    private int x;
    private int y;

    public MoveImpl(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveUp() {
        y++;
        System.out.println(this);
    }

    @Override
    public void moveDown() {
        y--;
        System.out.println(this);
    }

    @Override
    public void moveLeft() {
        x--;
        System.out.println(this);
    }

    @Override
    public void moveRight() {
        x++;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Current position : {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
