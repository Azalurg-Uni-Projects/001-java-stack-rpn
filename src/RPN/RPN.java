package stack.RPN;

import stack.RPN.Actions.RPN_Operation;
import stack.stack.Stack;

import java.util.Arrays;

public class RPN {
    private String[] expression;
    private RPN_Operation[] operations;
    private Stack memory;

    public RPN(String[] expression, RPN_Operation[] operations) {
        this.memory = new Stack();
        this.expression = expression;
        this.operations = operations;
    }

    public int calculate() {
        for (int i = 0; i<this.expression.length; i++){
            String character = this.expression[i];

           for(int j = 0; j<this.operations.length; j++) {
               boolean result = this.operations[j].compile(character, memory);
               if (result) {
                   break;
               }
           }
        }
        return memory.pop();
    }
}
