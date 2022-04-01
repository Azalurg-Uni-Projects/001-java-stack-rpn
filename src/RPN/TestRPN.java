package stack.RPN;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestRPN {

    @Test
    public void twoPlusTwo(){
        RPN rpn =  new RPN("2 2 +");

        assertEquals("2 + 2", 4, rpn.calculate());
    }

    @Test
    public void twoMinusTwo(){
        RPN rpn =  new RPN("2 2 -");

        assertEquals("2 - 2", 0, rpn.calculate());
    }

    @Test
    public void twoPlusMinusTwo(){
        RPN rpn =  new RPN("2 -2 +");

        assertEquals("2 + -2", 0, rpn.calculate());
    }

    @Test
    public void twoTimesTwo(){
        RPN rpn =  new RPN("2 2 *");

        assertEquals("2 * 2", 4, rpn.calculate());
    }

    @Test
    public void twoDivideByTwo(){
        RPN rpn =  new RPN("2 2 /");

        assertEquals("2 / 2", 1, rpn.calculate());
    }

    @Test
    public void longerExpression(){
        RPN rpn =  new RPN("8 2 5 * + 1 3 2 * + 4 - /");

        assertEquals("long XD", 6, rpn.calculate());
    }

}
