package com.rayin19.v2.pokemon.model;

public class Actor {
    private int x;
    private int y;

    public Actor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    //For moving player
    public void movePlayer(int dx, int dy){
        x += dx;
        y += dy;

    }

}
