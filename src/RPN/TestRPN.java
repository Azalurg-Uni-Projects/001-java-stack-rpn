package stack.RPN;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestRPN {

    @Test
    public void twoPlusTwo(){
        RPN rpn =  new RPN("2 2 +");

        assertEquals("2 + 2", 4, rpn.calculate());
    }

}
