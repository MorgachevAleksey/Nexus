package com.example.nexus.adapter;

import com.example.nexus.Nexus;
import com.example.nexus.application.Engine;
import com.example.nexus.domain.Board;


 public class TerminalRender {
    public static void hello() {
        System.out.println("In jedem Anfang liegt Zauber.");
    }

    public static void render(Board board){
        for (int j = 0; j < board.getHeight(); j++) {
            for (int i = 0; i < board.getWidth(); i++) {
                System.out.print(".");
            }
            System.out.println();
        }
    }

    public static void treeRender(String tree){
        System.out.println(tree);
    }
}
