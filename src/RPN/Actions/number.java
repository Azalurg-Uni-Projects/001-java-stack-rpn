package stack.RPN.Actions;

import stack.stack.Stack;

public class number implements RPN_Operation {
    @Override
    public boolean compile(String x, Stack memory) {
        if (x == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(x);
            memory.push(i);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
