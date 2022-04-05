package stack.RPN;

import stack.RPN.Actions.RPN_Operation;

public class RPNBuilder implements Builder {
    private String[] expression;
    private RPN_Operation[] operations;


    @Override
    public void setExpression(String expression) {
        this.expression = expression.split(" ");
    }

    @Override
    public void resetOperations(int a) {
        this.operations = new RPN_Operation[a];
    }

    @Override
    public void addOperation(RPN_Operation operation) {
        int len = operations.length;
        for(int i = 0; i < len; i++){
            if(operations[i] == null){
                this.operations[i] = operation;
            }
        }

    }

    public RPN getRPN() {
        return new RPN(expression, operations);
    }
}
