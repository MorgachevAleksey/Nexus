package com.example.nexus.domain;

public class Board {
    private final int width;
    private final int height;

    public Board(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
}
