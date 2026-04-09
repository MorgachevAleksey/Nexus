package com.example.nexus.domain;

public class Cell {
    private boolean isEmpty;
    private char element;
    private String color;
    private Cell[][] cells;

    Cell(){
        this.color = "green";
        this.isEmpty = true;
    }
    Cell(boolean isEmpty, char element, String color){
        this.isEmpty = isEmpty;
        this.element = element;
        this.color = color;
    }

    public boolean isEmpty(){
        return this.isEmpty;
    }
    public char getElement(){
        return this.element;
    }
    public String getColor(){
        return this.color;
    }
}
