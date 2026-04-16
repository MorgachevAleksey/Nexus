package com.example.nexus.application;

import com.example.nexus.domain.Board;
import com.example.nexus.domain.FormulaNode;

public class Engine {
    private final Board board;
    private static String tree;

    public Engine(Board board, String data){
        this.board = board;
        this.tree = data;
    }

    //Доска
    public Board getBoard() {
        return board;
    }

    //Дерево
    public static String rezultTree(String data){
        FormulaNode root = FormulaParser.parsing(data);
        boolean rezult = FormulaEvaluator.evaluate(root);
        if (rezult == true){
            return tree + "=1";
        } else if (rezult == false){
            return  tree + "=0";
        }
        else {
            return "error";
        }
    }
}
