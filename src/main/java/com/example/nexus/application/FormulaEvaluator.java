package com.example.nexus.application;

import com.example.nexus.domain.FormulaNode;
import com.example.nexus.domain.FormulaType;

//Считает значения узлов в готовой структуре
public class FormulaEvaluator {
    public static boolean evaluate(FormulaNode node){
        if (node.getType() == FormulaType.Type.ATOM) {
            return node.getValue();
        }

        boolean leftValue = evaluate(node.getLeft());
        boolean rightValue = evaluate(node.getRight());

        return switch (node.getType()) {
            case AND -> leftValue && rightValue;
            case OR -> leftValue || rightValue;
            case IMPLIES -> !leftValue || rightValue;
            case NOT -> !leftValue;
            default -> false;
        };}
}
