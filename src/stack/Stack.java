package stack.stack;

public class Stack {
    private int[] stack;
    private int top;
    public Stack() {
        this.stack = new int [10];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int item) {
        if (top == stack.length - 1){
            int[] newStack = new int[stack.length + 1];
            for (int i = 0; i < stack.length; i++)
                newStack[i] = stack[i];
            stack = newStack;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (this.isEmpty())
            throw new IllegalArgumentException();
        return stack[top--];
    }

    public int head() {
        if (this.isEmpty())
            throw new IllegalArgumentException();
        return stack[top];
    }

    public int size(){
        return top + 1;
    }
}
