package stack.tests;

import stack.RPN.Actions.*;

import stack.RPN.RPN;
import stack.RPN.RPNBuilder;

import org.junit.Before;
import org.junit.Test;
import stack.stack.Stack;

import static org.junit.Assert.*;

public class TestRPN {
    private RPNBuilder builder;

    @Before
    public void setUp() {
        builder = new RPNBuilder();
    }

    @Test
    public void twoPlusTwo(){
        builder.setExpression("2 2 +");
        builder.addOperation(new add());
        builder.addOperation(new number());
        RPN rpn =  builder.getRPN();

        assertEquals("2 + 2", 4, rpn.calculate());
    }

    @Test
    public void twoMinusTwo(){
        builder.setExpression("2 2 -");
        builder.addOperation(new number());
        builder.addOperation(new subtract());
        RPN rpn =  builder.getRPN();

        assertEquals("2 - 2", 0, rpn.calculate());
    }

    @Test
    public void twoPlusMinusTwo(){
        builder.setExpression("2 -2 +");
        builder.addOperation(new number());
        builder.addOperation(new add());
        RPN rpn =  builder.getRPN();

        assertEquals("2 + -2", 0, rpn.calculate());
    }

    @Test
    public void twoTimesTwo(){
        builder.setExpression("2 2 *");
        builder.addOperation(new number());
        builder.addOperation(new multiply());
        RPN rpn =  builder.getRPN();

        assertEquals("2 * 2", 4, rpn.calculate());
    }

    @Test
    public void longerExpression(){
        builder.setExpression("3 4 * 2 - 5 + 5 3 * -");
        builder.addOperation(new number());
        builder.addOperation(new add());
        builder.addOperation(new multiply());
        builder.addOperation(new subtract());
        RPN rpn =  builder.getRPN();

        assertEquals("long XD", 0, rpn.calculate());
    }

    @Test
    public void addTest(){
        RPN_Operation add = new add();
        Stack s = new Stack();
        s.push(2);
        s.push(2);

        assertTrue("2 + 2 (add)", add.compile("+", s));
    }

    @Test
    public void memoryCheck(){
        RPN_Operation add = new add();
        Stack s = new Stack();
        s.push(2);
        s.push(2);
        add.compile("+", s);

        assertEquals("memory check", 4, s.pop() );
    }

    @Test
    public void splitTest(){
        String e = "2 2 +";
        String[] array = e.split(" ");
        String ch = array[2];
        assertEquals("Test of split()", "+", ch);
    }

}
