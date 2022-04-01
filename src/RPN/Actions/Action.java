package stack.RPN.Actions;

import stack.stack.Stack;

interface Action {
    public boolean compile(String x, Stack memory);
}

