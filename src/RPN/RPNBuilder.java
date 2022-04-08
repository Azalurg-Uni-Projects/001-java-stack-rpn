package stack.RPN;

import stack.RPN.Actions.RPN_Operation;

public class RPNBuilder implements Builder {
    private String[] expression;
    private RPN_Operation[] operations;
    private int top;

    public RPNBuilder(){
        this.operations = new RPN_Operation[1];
        this.top = 0;
    }

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

        if(len == this.top){
            RPN_Operation[] newArray = new RPN_Operation[len + 1];
            System.arraycopy(this.operations, 0, newArray, 0, len);
            this.operations = newArray;
        }
        this.operations[this.top] = operation;
        this.top ++;
    }
    public RPN getRPN() {
        return new RPN(expression, operations);
    }
}
