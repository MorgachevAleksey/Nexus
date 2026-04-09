package com.example.nexus.domain;

//Хранит структуру узла
public class FormulaNode {
    private FormulaType.formulaType type;
    private boolean value;
    private FormulaNode left;
    private FormulaNode right;

    public FormulaNode(FormulaType.formulaType type, boolean value){
        this.type = type;
        this.value = value;
    }
    public FormulaNode(FormulaType.formulaType type, FormulaNode left, FormulaNode right){
        this.type = type;
        this.left = left;
        this.right = right;
    }
}
