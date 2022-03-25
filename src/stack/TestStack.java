package stack.stack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStack {
    private  Stack s;

    @Before
    public void setup() {s = new Stack(10);}

    @Test
    public void checkHead(){
        for(int i = 0; i < 10; i++){
            s.push(i);
        }
        int result = s.head();

        assertEquals("check head", 9, result);
    }
    
    @Test
    public void checkEmptyHead(){
       int result = s.head();

        assertNull("check empty head", result);
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
    public topUp(){
        for(int i = 100; i < 0; i++){
            s.push(i);
        }
        int result = s.pop();

        assertEquals("top up", 99, result);
    }
}
