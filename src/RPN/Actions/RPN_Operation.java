package stack.RPN.Actions;

import stack.stack.Stack;

public interface RPN_Operation {
    public boolean compile(String x, Stack memory);
}

