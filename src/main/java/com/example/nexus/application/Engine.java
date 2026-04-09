package com.example.nexus.application;

import com.example.nexus.domain.Board;
import com.example.nexus.domain.FormulaNode;
import com.example.nexus.application.FromulaParser;

public class Engine {
    //Доска
    private final Board board;

    public Engine(Board board){
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    //Дерево
    public char[] stingTree = {'(', '0', '&', '1', ')', '#', '1'};
    public final FromulaParser treeParser;
    public FormulaNode[] tree = treeParser.buildTree(char[] stringTree);
}
