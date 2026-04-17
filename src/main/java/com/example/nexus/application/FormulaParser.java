package com.example.nexus.application;

import com.example.nexus.domain.FormulaNode;
import com.example.nexus.domain.FormulaType;

//Строит структуру
public class FormulaParser {
    public static FormulaNode parsing(String data){
        int position = 0;
        FormulaNode root = null;
        while (position < data.length()){
            if (data.charAt(position) == '&'){
                root = new FormulaNode(FormulaType.Type.AND, atom_creating(String.valueOf(data.charAt(position - 1))), null);
                root.setRight(atom_creating(String.valueOf(data.charAt(position + 1))));
            }
            position++;
        }
        return root;
    }

    public static FormulaNode atom_creating(String element){
        FormulaNode node = null;
        if (element.equals("0")) {
            node = new FormulaNode(FormulaType.Type.ATOM, false);
        }
        else if (element.equals("1")) {
            node = new FormulaNode(FormulaType.Type.ATOM, true);
        }
        return node;
    }
}