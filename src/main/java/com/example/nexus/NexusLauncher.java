package com.example.nexus;

import com.example.nexus.adapter.TerminalRender;
import com.example.nexus.application.Engine;
import com.example.nexus.domain.Board;


public class NexusLauncher {
    public static void main(String[] args) {
        Board board = new Board(10, 10);
        Engine engine = new Engine(board);

        TerminalRender.hello();
        TerminalRender.render(engine.getBoard());
    }
}
