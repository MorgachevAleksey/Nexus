package com.example.nexus.domain;

//Хранит структуру узла
public class FormulaNode {
    private FormulaType type;
    private Boolean value;
    private FormulaNode left;
    private FormulaNode right;

    FormulaNode(FormulaType type, Boolean value, FormulaNode left, FormulaNode right){
        this.type = type;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
