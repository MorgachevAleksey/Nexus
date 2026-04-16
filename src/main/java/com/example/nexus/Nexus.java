package com.example.nexus;

import com.example.nexus.adapter.TerminalRender;
import com.example.nexus.application.Engine;
import com.example.nexus.domain.Board;


public class Nexus {
    public static void main(String[] args) {
        Board board = new Board(10, 10);
        String inputFormula = "1&0&1";

        Engine engine = new Engine(board, inputFormula);

        TerminalRender.hello();
        TerminalRender.render(engine.getBoard());
        String rezultTree = Engine.rezultTree(inputFormula);
        TerminalRender.treeRender(rezultTree);
    }
}