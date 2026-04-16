package com.example.nexus.domain;

//Хранит структуру узла
public class FormulaNode {
    private FormulaType.Type type;
    private boolean value;
    private FormulaNode left;
    private FormulaNode right;

    public FormulaNode(FormulaType.Type type, boolean value){
        this.type = type;
        this.value = value;
    }
    public FormulaNode(FormulaType.Type type, FormulaNode left, FormulaNode right){
        this.type = type;
        this.left = left;
        this.right = right;
    }

    public void setRight(FormulaNode node){
        this.right = node;
    }

    public FormulaType.Type getType() {
        return type;
    }
    public boolean getValue(){
        return value;
    }
    public FormulaNode getLeft(){
        return left;
    }
    public FormulaNode getRight(){
        return right;
    }

}
