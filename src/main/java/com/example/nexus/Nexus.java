package com.example.nexus;

import com.example.nexus.adapter.TerminalRender;
import com.example.nexus.application.Engine;
import com.example.nexus.domain.Board;
import com.example.nexus.domain.Cell;


public class Nexus {
    public static void main(String[] args) {
        Board board = new Board(10, 10);
        char[] stringTree = {'1', '&', '0'}; //Заменить на ввод с консоли с помощью парсера

        Engine engine = new Engine(board, stringTree);

        TerminalRender.hello();
        TerminalRender.render(engine.getBoard());
        TerminalRender.treeRender(engine.getTree());
    }
}
