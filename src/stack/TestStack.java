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
}
