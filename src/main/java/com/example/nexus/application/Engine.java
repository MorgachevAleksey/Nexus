package com.example.nexus.application;

import com.example.nexus.domain.Board;
import com.example.nexus.domain.FormulaNode;

public class Engine {
    public Engine(Board board, char[] tree){
        this.board = board;
        this.tree = tree;
    }

    //Доска
    private final Board board;
    public Board getBoard() {
        return board;
    }

    //Дерево
    //TODO Считать из строки и преобразовать в char[]
    FormulaNode root = FormulaParser.buildTree();
    private char[] tree = FormulaEvaluator.evaluateTree(root);
    public char[] getTree(){
        return tree;
    }
}
