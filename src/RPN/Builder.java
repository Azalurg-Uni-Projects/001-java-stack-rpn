package stack.RPN;

import stack.RPN.Actions.RPN_Operation;

public interface Builder {
    void setExpression(String expression);
    void resetOperations(int a);
    void addOperation(RPN_Operation operation);
}
