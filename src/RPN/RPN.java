package stack.RPN;

import stack.stack.Stack;

import java.util.Arrays;

public class RPN {
    private String[] array;
    private Stack memory;

    public RPN(String expression){
        this.memory = new Stack();
        this.array = expression.split(" ");
    }

    private boolean isNumber (String nr) {
        if (nr == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(nr);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public void print(){
        System.out.println(Arrays.toString(this.array));
    }

    public int calculate() {
        for (int i = 0; i<this.array.length; i++){
            String character = this.array[i];
            int number;
            if (this.isNumber(character)) {
                number = Integer.parseInt(character);
                this.memory.push(number);
            }
            else{
                int b = this.memory.pop();
                int a = this.memory.pop();
                switch(character){
                    case "+":
                        memory.push(a + b);
                        break;
                    case "-":
                        memory.push(a - b);
                        break;
                    case "*":
                        memory.push(a * b);
                        break;
                    case "/":
                        memory.push(a / b);
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        return memory.pop();
    }
}
