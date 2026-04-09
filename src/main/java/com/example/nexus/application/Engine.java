package com.example.nexus.application;

import com.example.nexus.domain.Board;
import com.example.nexus.domain.FormulaNode;

public class Engine {
    public Engine(Board board, char[] stringTree){
        this.board = board;
        this.stringTree = stringTree;
    }

    //Доска
    private final Board board;
    public Board getBoard() {
        return board;
    }

    //Дерево
    //TODO Считать из строки и преобразовать в char[]
    private char[] stringTree;
    FormulaNode root = FormulaParser.buildTree(this.stringTree);
    private char[] Tree = FormulaEvaluator.evaluateTree(root);

    public char[] getTree(){
        return Tree;
    }
}
