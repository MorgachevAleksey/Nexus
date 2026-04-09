package com.example.nexus.application;

import com.example.nexus.domain.FormulaNode;
import com.example.nexus.domain.FormulaType;

//Строит структуру
public class FormulaParser {
    public static char[] getStringTree(){
        char[] stringTree = {'1', '&', '0'};
        return stringTree;
    }

    public static FormulaNode buildTree(){
        FormulaNode[] tree = new FormulaNode[3];
        tree[0]= new FormulaNode(FormulaType.formulaType.ATOM, true);
        tree[1]= new FormulaNode(FormulaType.formulaType.AND, tree[0], tree[2]);
        tree[2]= new FormulaNode(FormulaType.formulaType.ATOM, false);
        return tree[1];
    }
}
