package com.example.nexus.application;

import com.example.nexus.domain.Board;

public class Engine {
    private final Board board;

    public Engine(Board board){
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }
}
