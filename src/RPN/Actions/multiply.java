package stack.RPN.Actions;

import stack.stack.Stack;

public class multiply implements RPN_Operation {
    @Override
    public boolean compile(String x, Stack memory) {
        if ("*".equals(x)) {
            int b = memory.pop();
            int a = memory.pop();
            memory.push(a * b);
            return true;
        }
        return false;
    }
}
