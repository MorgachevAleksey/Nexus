package com.example.nexus.domain;

import com.example.nexus.domain.Cell;

public class Board {
    private final int width;
    private final int height;
    private Cell[][] cells;

    public Board(int width, int height){
        this.width = width;
        this.height = height;

        cells = new Cell[width][height];
        for(int i = 0; i < this.width; i++){
            for(int j = 0; j < this.width; j++){
                cells[i][j] = new Cell(true, ' ', "green");
            }
        }
    }

    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
}
