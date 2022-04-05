package stack.tests;

import org.junit.Before;
import org.junit.Test;
import stack.stack.Stack;

import static org.junit.Assert.*;

public class TestStack {
    private Stack s;

    @Before
    public void setup() {s = new Stack();}

    @Test
    public void checkHead(){
        for(int i = 0; i < 10; i++){
            s.push(i);
        }
        int result = s.head();

        assertEquals("check head", 9, result);
    }

    @Test
    public void getSize(){
        for(int i = 0; i < 10; i++){
            s.push(i);
        }
        int result = s.size();

        assertEquals("get size", 10, result);
    }

    @Test
    public void topUp(){
        for(int i = 0; i < 100; i++){
            s.push(i);
        }
        System.out.println(s.head());
        int result = s.head();

        assertEquals("top up", 99, result);
    }
}
